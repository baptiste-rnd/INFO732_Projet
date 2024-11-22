package fichiers_code;

public class Powerpoint extends Document {
    private int nbSlides; // Nombre de diapositives

    public Powerpoint(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);
        setNbSlides(0); // Initialise le nombre de diapositives
    }

    public int getNbSlides() {
        return nbSlides; // Retourne le nombre de diapositives
    }

    public void setNbSlides(int nbSlides) {
        this.nbSlides = nbSlides; // Modifie le nombre de diapositives
    }

    @Override
    public void String() {
        // Appelle la méthode String de Document et ajoute les informations spécifiques au PowerPoint
        super.String();
        System.out.println("Nombre de diapositives: " + this.nbSlides);
    }

    @Override
    public void Open() {
        // Simule l'ouverture d'un fichier PowerPoint
        System.out.println("Ouvre PowerPoint et lance la présentation " + this.getTitle());
    }
}
