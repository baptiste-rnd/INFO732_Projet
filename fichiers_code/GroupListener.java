package fichiers_code;

public interface GroupListener {
    void onMessageRemoved(Group group, Message message);

    void onDocumentRemoved(Group group, Document document);

    void onUserInvited(Group group, User user);

    void onUserExcluded(Group group, User user);

    void onMessageReceived(Group group); // Méthode pour notifier la réception d'un message

    void onSuperMessageReceived(Group group);
}
