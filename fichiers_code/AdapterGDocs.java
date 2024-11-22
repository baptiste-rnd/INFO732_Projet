package fichiers_code;

public class AdapterGDocs extends Document {

    public AdapterGDocs(String title, String content, String format, User owner, boolean isShared) {
        super(title, content, format, owner, isShared);
    }

    public void Open() {
        // pass
    }
}
