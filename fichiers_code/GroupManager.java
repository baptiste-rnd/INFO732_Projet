package fichiers_code;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {

    private List<GroupListener> groupListeners;

    public GroupManager() {
        this.groupListeners = new ArrayList<>();
    }

    public void addGroupListener(GroupListener listener) {
        if (listener != null && !groupListeners.contains(listener)) {
            groupListeners.add(listener);
            System.out.println("Listener has been added with success.");
        } else {
            System.out.println("Invalid listener or already exist.");
        }
    }

    public void removeGroupListener(GroupListener listener) {
        if (listener != null && groupListeners.remove(listener)) {
            System.out.println("Listener has been deleted with success.");
        } else {
            System.out.println("Invalide listener or not found.");
        }
    }

    public void notifyMessageReceived(Group group) {
        if (group != null) {
            for (GroupListener listener : groupListeners) {
                listener.onMessageReceived(group);
            }
            System.out.println("All listeners have been notified of a new message.");
        } else {
            System.out.println("Invalide groupe.");
        }
    }
}
