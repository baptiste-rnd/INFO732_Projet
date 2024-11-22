package fichiers_code;

public abstract class Document {
    private String title, content, format;
    private User owner;
    private boolean isShared;

    public Document(String title, String content, String format, User owner, boolean isShared) {
        this.title = title; // Initialise le document avec un titre, contenu, format, propriétaire et statut
                            // de partage
        this.content = content;
        this.format = format;
        this.owner = owner;
        this.isShared = isShared;
    }

    public String getTitle() {
        return title; // Retourne le titre du document
    }

    public void setTitle(String title) {
        this.title = title; // Modifie le titre du document
    }

    public String getContent() {
        return content; // Retourne le contenu du document
    }

    public void setContent(String content) {
        this.content = content; // Modifie le contenu du document
    }

    public String getFormat() {
        return format; // Retourne le format du document
    }

    public void setFormat(String format) {
        this.format = format; // Modifie le format du document
    }

    public User getOwner() {
        return owner; // Retourne le propriétaire du document
    }

    public void setOwner(User owner) {
        this.owner = owner; // Modifie le propriétaire du document
    }

    public boolean isShared() {
        return isShared; // Retourne l'état de partage du document (partagé ou non)
    }

    public void setShared(boolean isShared) {
        this.isShared = isShared; // Modifie l'état de partage du document
    }

    public void String() {
        System.out
                .println("Titre: " + this.title + "\n" + "Créateur: " + this.owner.getSurname() + "\n" + this.content);
        // Affiche les détails du document (titre, créateur, contenu)
    }

    public void Open() {
        
    }

}
