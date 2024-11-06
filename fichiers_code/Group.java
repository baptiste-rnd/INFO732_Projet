package fichiers_code;

import java.util.ArrayList;

class Group {
    private String name;
    private int nbPeople;
    private GroupManager groupmanager;
    private ArrayList<User> membres;
    private ArrayList<Message> chat;
    private ArrayList<Document> documents;

    public Group(String name) {
        this.name = name; // Initialise un groupe avec un nom
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
    }

    public void removeMembre(User user) {
        for (User membre : membres) {
            if (membre.getStudentNb() == user.getStudentNb()) {
                this.membres.remove(user); // Supprime un membre du groupe
            }
        }
    }

    public GroupManager getGroupmanager() {
        return groupmanager;
    }

    public void setGroupmanager(GroupManager groupmanager) {
        this.groupmanager = groupmanager;
    }

    public void addMessage(Message message) {
        chat.add(message); // Ajoute un message au chat du groupe
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
            System.out.println(message.getContent()); // Affiche tous les messages du chat
        }
    }

    public void addDocument(Document document) {
        documents.add(document); // Ajoute un document au chat du groupe
    }

    public void removeDocument(Document document) {
        this.documents.remove(document);// Supprimer un document du chat de groupe
    }

}