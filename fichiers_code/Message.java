package fichiers_code;

public class Message {
    private String content;
    private User owner;

    public Message(String content,User owner) {
        this.content = content;
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "contenu : " + content + " écrit par : " + owner;
    }
    
}
