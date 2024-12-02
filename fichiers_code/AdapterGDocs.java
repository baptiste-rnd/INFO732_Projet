package fichiers_code;

// Bonne exécution
public class AdapterGDocs extends Document {

    public AdapterGDocs(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);

    }

    public void Open() {
        // appelle à une classe d'un service google Docs
        System.out.println("Le gdoc a été ouvert dans une autre fenêtre");
    }

    public void ConvertPDF() {
        // appelle à une classe d'un service google Docs
        System.out.println("Le document a bien été converti en PDF");
    }
}
