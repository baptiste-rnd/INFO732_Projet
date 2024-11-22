package fichiers_code;

public class PDF extends Document {
    private int nbPage; // Durée en minutes

    public PDF(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);
        setNbPage(1); // Initialise le nb page spécifique aux fichiers PDF
    }

    public int getNbPage() {
        return nbPage; // Retourne la durée
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage; // Modifie la durée
    }

    @Override
    public void String() {
        // Appelle la méthode toString de Document et ajoute les informations spécifiques au PDF
        super.String();
        System.out.println("nb de page: " + this.nbPage );
    }
   
    @Override
    public void Open(){
       System.out.println("ouvre PDF reader et lit "+ this.getTitle()); 
    }
}

