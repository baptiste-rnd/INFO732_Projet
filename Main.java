import fichiers_code.*;

public class Main {
    public static void main(String[] args) {
        // Création d'utilisateurs
        User user1 = new User(1, 1234, "Alice", "Dupont", 20, 3);
        User user2 = new User(2, 5678, "Bob", "Martin", 22, 4);
        
        // Création d'un groupe
        Group group1 = new Group("Group1");
        group1.addMembre(user1);
        group1.addMembre(user2);
        
        // Création d'un gestionnaire de groupe
        GroupManager groupManager = new GroupManager();
        
        // Ajout du listener au gestionnaire de groupe
        GroupListener listener = new GroupListener() {
            @Override
            public void onMessageRemoved(Group group, Message message) {
                System.out.println("Message removed from group " + group.getName());
            }

            @Override
            public void onDocumentRemoved(Group group, Document document) {
                System.out.println("Document removed from group " + group.getName());
            }

            @Override
            public void onUserInvited(Group group, User user) {
                System.out.println(user.getName() + " invited to group " + group.getName());
            }

            @Override
            public void onUserExcluded(Group group, User user) {
                System.out.println(user.getName() + " excluded from group " + group.getName());
            }

            @Override
            public void onMessageReceived(Group group) {
                System.out.println("New message received in group " + group.getName());
            }
        };

        groupManager.addGroupListener(listener);

        // Ajout d'un message
        user1.createMessage("Hello, this is a test message!", group1);

        // Affichage du chat du groupe
        group1.afficherChat();

        // Suppression d'un message
        Message messageToDelete = group1.getChat().get(0);
        user1.deleteMessage(messageToDelete, group1);

        // Création d'un document
        Document document = user1.createDocument("Document1", "This is a test document.", "pdf");

        // Publication du document dans le groupe
        user1.publishDocument(document, group1);

        // Modification du document
        user1.modifyDocument(document, "Updated document content.");

        // Exclusion d'un utilisateur du groupe
        group1.removeMembre(user2);
        groupManager.notifyUserExcluded(group1, user2);
        
        // Inviter un utilisateur
        group1.addMembre(user2);
        groupManager.notifyUserInvited(group1, user2);

        // Supprimer un document
        group1.removeDocument(document);
        groupManager.notifyDocumentRemoved(group1, document);

        // Création d'un groupe administré par AdminGroup
        AdminGroup admin = new AdminGroup(3, 1111, "Charlie", "Blake", 24, 5, groupManager);
        admin.removeMessage(group1, messageToDelete);
        admin.removeDocument(group1, document);
        admin.inviteUser(group1, user1);
        admin.excludeUser(group1, user2);

        // Test de la classe Campus
        Campus campus = Campus.getInstance("Polytech");
        System.out.println("Campus instance: " + campus);

        // Test de la classe CampusGroup
        CampusGroup campusGroup = new CampusGroup("Campus Group");
        Announcement announcement = new Announcement("Meeting", "There is a meeting tomorrow.");
        campusGroup.viewAnnoucements();
        campusGroup.postAnnouncement(announcement);
    }
}
