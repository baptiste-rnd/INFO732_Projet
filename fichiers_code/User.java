package fichiers_code;

public class User {
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

    public void createGroupe(String name) {
    }

    public void createMessage(String content, Group group) {
        Message newMessage = new Message(content, this);
        group.addMessage(newMessage);
    }
    
    public void deleteMessage() {

    }
    
    public Document createDocument(String title, String content, String format, boolean isShared) {

    }

    public void modifyDocument() {

    }

    public void onMessageReceived() {
        
    }
}
