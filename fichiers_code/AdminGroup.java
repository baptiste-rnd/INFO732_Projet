package fichiers_code;

public class AdminGroup extends User {

    private GroupManager groupManager;

    // Constructeur
    public AdminGroup(int studentNb, int password, String name, String surname, int age, int studyYear,
            GroupManager groupManager) {
        super(studentNb, password, name, surname, age, studyYear); // Appel au constructeur de la classe parente User
        this.groupManager = groupManager;
    }

    // Méthode pour supprimer un message dans un groupe
    public void removeMessage(Group group, Message message) {
        if (group != null && message != null) {
            group.removeMessage(message);
            System.out.println("Message deleted from chat.");
            groupManager.notifyMessageRemoved(group, message); // Notification des listeners via GroupManager
        } else {
            System.out.println("Chat or message invalid.");
        }
    }

    // Méthode pour supprimer un document dans un groupe
    public void removeDocument(Group group, Document doc) {
        if (group != null && doc != null) {
            group.removeDocument(doc);
            System.out.println("The document has been successfully deleted.");
            groupManager.notifyDocumentRemoved(group, doc); // Notification des listeners via GroupManager
        } else {
            System.out.println("You cannot delete this document.");
        }
    }

    // Méthode pour inviter un utilisateur dans un groupe
    public void inviteUser(Group group, User user) {
        if (user != null) {
            group.addMembre(user);
            System.out.println(user.getName() + " has been invited to the group " + group.getName());
            groupManager.notifyUserInvited(group, user); // Notification des listeners via GroupManager
        } else {
            System.out.println("Invalid User.");
        }
    }

    // Méthode pour exclure un utilisateur du groupe
    public void excludeUser(Group group, User user) {
        if (user != null) {
            group.removeMembre(user);
            System.out.println(user.getName() + " has been excluded from the group " + group.getName());
            groupManager.notifyUserExcluded(group, user); // Notification des listeners via GroupManager
        } else {
            System.out.println("Invalid User.");
        }
    }
}
