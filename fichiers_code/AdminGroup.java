import javax.swing.GroupLayout.Group;

public class AdminGroup extends User {
    private GroupManager groupManager;

    public AdminGroup(GroupManager groupManager) {
        super(); // Appel au constructeur de la classe parente User
        this.groupManager = groupManager;
    }

    public void removeMessage(Group group, Message message) {
        if (group != null && message != null) {
            group.remove(message);
            System.out.println("Message deleted from chat.");
        } else {
            System.out.println("Chat or message invalid.");
        }
    }

    public void removeDocument(Document doc) {
        if (doc != null && doc.getOwner().equals(this)) {
            doc.delete();
            System.out.println("The document has been successfully deleted.");
        } else {
            System.out.println("You cannot delete this document");
        }
    }

    public void inviteUser(Group group, User user) {
        if (user != null) {
            group.add(user);
            System.out.println(user.getUsername() + " has been invited in the group" + group.getName());

        } else {
            System.out.println("Invalid User.");
        }
    }

    public void excludeUser(Group group, User user) {
        if (user != null) {
            group.remove(user);
            System.out.println(user.getUsername() + "has been deleted from the group" + group.getName());
        } else {
            System.out.println("Invalid User.");
        }

    }
}
