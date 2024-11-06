package fichiers_code;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {

    private List<GroupListener> groupListeners;

    public GroupManager() {
        this.groupListeners = new ArrayList<>();
    }

    // Méthode pour ajouter un listener
    public void addGroupListener(GroupListener listener) {
        if (listener != null && !groupListeners.contains(listener)) {
            groupListeners.add(listener);
            System.out.println("Listener has been added successfully.");
        } else {
            System.out.println("Invalid listener or already exists.");
        }
    }

    // Méthode pour retirer un listener
    public void removeGroupListener(GroupListener listener) {
        if (listener != null && groupListeners.remove(listener)) {
            System.out.println("Listener has been removed successfully.");
        } else {
            System.out.println("Invalid listener or not found.");
        }
    }

    // Méthode pour notifier tous les listeners de la suppression d'un message
    public void notifyMessageRemoved(Group group, Message message) {
        for (GroupListener listener : groupListeners) {
            listener.onMessageRemoved(group, message);
        }
    }

    // Méthode pour notifier tous les listeners de la suppression d'un document
    public void notifyDocumentRemoved(Group group, Document document) {
        for (GroupListener listener : groupListeners) {
            listener.onDocumentRemoved(group, document);
        }
    }

    // Méthode pour notifier tous les listeners de l'ajout d'un utilisateur
    public void notifyUserInvited(Group group, User user) {
        for (GroupListener listener : groupListeners) {
            listener.onUserInvited(group, user);
        }
    }

    // Méthode pour notifier tous les listeners de l'exclusion d'un utilisateur
    public void notifyUserExcluded(Group group, User user) {
        for (GroupListener listener : groupListeners) {
            listener.onUserExcluded(group, user);
        }
    }

    // Méthode pour notifier qu'un nouveau message a été reçu
    public void notifyMessageReceived(Group group) {
        for (GroupListener listener : groupListeners) {
            listener.onMessageReceived(group);
        }
    }
}
