import java.util.List;

import fichiers_code.*;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Création d'utilisateurs
        User user1 = new User(1, 1234, "Alice", "Dupont", 20, 3);
        User user2 = new User(2, 5678, "Bob", "Martin", 22, 4);
        User user3 = new User(3, 5678, "Thomas", "Martin", 22, 4);

        // Creation d'un groupe
        List<Object> res = user1.createGroupe("test");
        Group group1 = (Group) res.get(0);
        AdminGroup admingroup1 = (AdminGroup) res.get(1);

        // Creation d'un deuxieme groupe
        List<Object> res2 = user3.createGroupe("test2");
        Group group2 = (Group) res2.get(0);
        // AdminGroup admingroup2 = (AdminGroup) res2.get(1);

        // L'admin ajoute un autre membre au groupe
        admingroup1.inviteUser(user2);

        System.out.println("Personne dans le groupe: ");
        System.out.println(group1.getMembres() + "\n");

        // Ajout d'un message
        user1.createMessage("Hello, this is a test message!", group1);
        user2.createMessage("coucou @Alice", group1);

        // affichage du chat
        System.out.println(" \nChat du groupe: ");
        group1.afficherChat();

        // Suppression d'un message
        Message messageToDelete = group1.getChat().get(0);
        user2.deleteMessage(messageToDelete, group1);
        user1.deleteMessage(messageToDelete, group1);

        System.out.println(" \nChat du groupe1: ");
        group1.afficherChat();

        // Création d'un document
        Document document = user2.createDocument("Document1", "This is a test document.", "pdf");

        // Publication du document dans le groupe
        user2.publishDocument(document, group1);
        document.String();

        // Modification du document
        user2.modifyDocument(document, "Updated document content.");
        document.String();

        // ajout du doc dans le groupe
        user2.publishDocument(document, group1);

        // ajout d'un doc quand fais pas partie du groupe
        user2.publishDocument(document, group2);

        System.out.println("Membres du groupe2 :\n" + group2.getMembres() + "\n");

        // exclusion d'un membre
        admingroup1.excludeUser(user2);

        System.out.println("Message du chat du groupe 1:\n");
        admingroup1.seeMessage(group1);

        // Test de la classe Campus
        Campus campus = Campus.getInstance();
        System.out.println("Campus instance: " + campus);

        // Test de la classe CampusGroup
        Announcement announcement = new Announcement("Meeting", "There is a meeting tomorrow.");
        campus.getCampusGroup().addMembre(user1);
        campus.getCampusGroup().addMembre(user2);
        campus.getCampusGroup().addMembre(user3);
        campus.getCampusGroup().viewAnnoucements();
        campus.getCampusGroup().postAnnouncement(announcement);

    }
}
