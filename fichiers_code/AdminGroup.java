package fichiers_code;

public class AdminGroup extends User {
    private GroupManager groupManager;

    public AdminGroup(int studentNb, int password, String name, String surname, int age, int studyYear, GroupManager groupManager) {

        super(studentNb, password, name, surname, age, studyYear); // Appel au constructeur de la classe parente User
        this.groupManager = groupManager;
    }

    public void removeMessage(Group group, Message message) {
        if (group != null && message != null) {
            group.removeMessage(message);
            System.out.println("Message deleted from chat.");
        } else {
            System.out.println("Chat or message invalid.");
        }
    }

    public void removeDocument(Group group, Document doc) {
        if (group != null && group.getGroupmanager().equals(this)) {
            group.removeDocument(doc);
            System.out.println("The document has been successfully deleted.");
        } else {
            System.out.println("You cannot delete this document");
        }
    }

    public void inviteUser(Group group, User user){
        if (user!=null) {
            group.addMembre(user);
            System.out.println(user.getName() + " has been invited in the group"  + group.getName());

        } else {
            System.out.println("Invalid User.");
        }
    }

    public void excludeUser(Group group, User user) {
        if (user != null) {
            group.removeMembre(user);
            System.out.println(user.getName() + "has been deleted from the group" + group.getName());
        } else {
            System.out.println("Invalid User.");
        }

    }
}
