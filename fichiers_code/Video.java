package fichiers_code;

public class Video extends Document {
    private int duree; // Durée en secondes ou minutes

    public Video(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);
        this.setDuree(0); // Initialise la durée spécifique aux vidéos
    }

    public int getDuree() {
        return duree; // Retourne la durée
    }

    public void setDuree(int duree) {
        this.duree = duree; // Modifie la durée
    }

    @Override
    public void String() {
        // Appelle la méthode toString de Document et ajoute les informations spécifiques à la vidéo
        super.String();
        System.out.println("Durée: " + this.duree + " minutes");
    }

    @Override
    public void Open() {
        // Simule l'ouverture d'une vidéo dans VLC
        System.out.println("Ouvre VLC et lance la vidéo " + this.getTitle());
    }
}
