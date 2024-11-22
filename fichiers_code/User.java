package fichiers_code;

import java.util.ArrayList;
import java.util.List;

public class User implements GroupListener {
    private int studentNb;
    private int password;
    private String name;
    private String surname;
    private int age;
    private int studyYear;

    // Constructeur
    public User(int studentNb, int password, String name, String surname, int age, int studyYear) {
        this.studentNb = studentNb;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studyYear = studyYear;
    }

    public int getStudentNb() {
        return studentNb;
    }

    public void setStudentNb(int studentNb) {
        this.studentNb = studentNb;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public String toString() {
        return "Profil de l'utilisateur : \nNuméro d'étudiant : " + studentNb + "\n nom : " + name + "\n prenom : "
                + surname + "\n niveau : " + studyYear;
    }

    public List<Object> createGroupe(String namegroup) {
        List<Object> res = new ArrayList<>();
        GroupManager groupManager = new GroupManager();
        Group group = new Group(namegroup, groupManager);
        AdminGroup admin = new AdminGroup(studentNb, password, name, name, age, studyYear, groupManager, group);
        admin.inviteUser(this);
        res.add(group);
        res.add(admin);
        return res;
    }

    public void createMessage(String content, Group group) {
        Message newMessage = new Message(content, this);
        group.addMessage(newMessage);
    }

    public void deleteMessage(Message message, Group group) {
        if (message.getOwner() != this) {
            System.out.println("vous n'avez pas le droit car ce n'est pas votre message");

        }
        if (!group.getMembres().contains(this)) {
            System.out.println("vous ne faites pas partie du groupe");
        } else {
            group.removeMessage(message);
        }
    }

    public Document createDocument(String title, String content, String format) {
        if (format.equals("video")) {
            Video newVideo = new Video(title, content, format, this, false);
            return newVideo;
        }
        if (format.equals("pdf")) {
            PDF newPDF = new PDF(title, content, format, this, false);
            return newPDF;
        }
        if (format.equals("powerpoint")) {
            Powerpoint newPowerpoint = new Powerpoint(title, content, format, this, false);
            return newPowerpoint;
        }
        if (format.equals("gdocs")) {
            AdapterGDocs newAdapterGDocs = new AdapterGDocs(title, content, format, this, false);
            return newAdapterGDocs;
        }
        return null;
    }

    public void publishDocument(Document document, Group group) {
        if (document.getOwner() != this) {
            System.out.println("vous n'avez pas le droit car ce n'est pas votre document");
        }
        if (!group.getMembres().contains(this)) {
            System.out.println("vous ne faites pas partie du groupe");
        } else {
            document.setShared(true);
            group.addDocument(document);
        }
    }

    public void modifyDocument(Document document, String content) {
        if (document.getOwner() != this) {
            System.out.println("vous n'avez pas le droit car ce n'est pas votre document");
        } else {
            document.setContent(content);
        }
    }

    public void onMessageReceived(Group group) {
        System.out.println(name + " a recu un message");
    }

    public void seeMessage(Group group) {
        group.afficherChat();
    }

    public void onMessageRemoved(Group group, Message message) {
        // pass
    }

    @Override
    public void onDocumentRemoved(Group group, Document document) {
        // pass
    }

    @Override
    public void onUserInvited(Group group, User user) {
        // pass
    }

    @Override
    public void onUserExcluded(Group group, User user) {
        // pass
    }

    public void createAnnouncement(String title, String content) {
        Announcement announcement = new Announcement(title, content);
        Campus campus = Campus.getInstance();
        campus.getCampusGroup().postAnnouncement(announcement);
    }

    @Override
    public void onSuperMessageReceived(Group group) {
        System.out.println(name + " a recu le super message");
    }
}
