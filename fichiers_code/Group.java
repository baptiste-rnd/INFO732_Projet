package fichiers_code;

import java.util.ArrayList;

public class Group {
    private String name;
    private int nbPeople;
    private GroupManager groupmanager;
    private ArrayList<User> membres;
    private ArrayList<Message> chat;
    private ArrayList<Document> documents;

    public Group(String name, GroupManager groupManager) {
        this.name = name; // Initialise un groupe avec un nom
        this.groupmanager = groupManager;
        this.membres = new ArrayList<User>();
        this.chat = new ArrayList<Message>();
        this.documents = new ArrayList<Document>();
    }

    public String getName() {
        return name; // Retourne le nom du groupe
    }

    public void setName(String name) {
        this.name = name; // Modifie le nom du groupe
    }

    public int getNbPeople() {
        return nbPeople; // Retourne le nombre de membres dans le groupe
    }

    public void addMembre(User user) {
        this.membres.add(user); // Ajoute un membre au groupe
        nbPeople++;
    }

    public void removeMembre(User user) {
        this.membres.remove(user); // Supprime un membre du groupe
    }

    public GroupManager getGroupmanager() {
        return groupmanager;
    }

    public void setGroupmanager(GroupManager groupmanager) {
        this.groupmanager = groupmanager;
    }

    public void addMessage(Message message) {
        chat.add(message); // Ajoute un message au chat du groupe
        User membre = null; // Utilisateur mentionné (si trouvé)
        String name_member = ""; // Nom extrait après @
        String content_message = message.getContent();

        // Bien
        // Vérifie la présence d'une mention (@) dans le message
        if (content_message.contains("@")) {
            int atIndex = content_message.indexOf('@');
            int spaceIndex = content_message.indexOf(' ', atIndex);

            // Si aucun espace trouvé après @, prendre tout jusqu'à la fin
            if (spaceIndex == -1) {
                name_member = content_message.substring(atIndex + 1);
            } else {
                // Extraire le texte entre @ et le premier espace
                name_member = content_message.substring(atIndex + 1, spaceIndex);
            }

            // Recherche de l'utilisateur mentionné dans la liste des membres
            for (User user : membres) {
                if (user.getName().equals(name_member)) {
                    membre = user;
                    break; // Arrêter la boucle dès qu'on trouve l'utilisateur
                }
            }
        }

        // Notifier tout le monde du nouveau message, avec l'utilisateur mentionné (si
        // applicable)
        this.notifyEveryoneNewMessage(membre);
    }

    public void removeMessage(Message message) {
        this.chat.remove(message);// Supprimer un message du chat de groupe
    }

    public ArrayList<Message> getChat() {
        return this.chat; // Retourne la liste des messages du chat du groupe
    }

    public void String() {
        System.out.println("Nom: " + this.name + "\nNombres de personnes" + this.nbPeople);

    }

    public void afficherChat() {
        for (Message message : chat) {
            System.out.println(message); // Affiche tous les messages du chat
        }
    }

    public void addDocument(Document document) {
        documents.add(document); // Ajoute un document au chat du groupe
    }

    public void removeDocument(Document document) {
        this.documents.remove(document);// Supprimer un document du chat de groupe
    }

    public void notifyEveryoneNewMessage(User member) {
        groupmanager.notifyMessageReceived(this, member);
    }

    public ArrayList<User> getMembres() {
        return membres;
    }
}
