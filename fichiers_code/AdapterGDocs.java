package fichiers_code;

public class AdapterGDocs extends Document {

    public AdapterGDocs(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);

    }

    public void Open() {
        System.out.println("Le gdoc a été ouvert dans une autre fenêtre");
    }

    public void ConvertPDF() {
        System.out.println("Le document a bien été converti en PDF");
    }
}
