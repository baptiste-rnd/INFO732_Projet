package fichiers_code;

public class Announcement {
    // Attributs
    private String title;
    private String content;
    private User creator;

    // Constructor
    public Announcement(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    public User getCreator() {
        return this.creator;
    }

    // Methods
    @Override
    public String toString() {
        return "Announcement{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", creator='" + creator + '\'' + '}';
    }
}
