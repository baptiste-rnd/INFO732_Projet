package fichiers_code;

public class Campus {
    // Attributs
    private static Campus instance;
    private CampusGroup campusGroup;

    // Constructor
    private Campus() {
        this.campusGroup = new CampusGroup("campusgroup");
    }

    // Methods
    public static Campus getInstance(String name) {
        if (instance == null) {
            instance = new Campus();
        }
        return instance;
    }

    public CampusGroup getCampusGroup() {
        return campusGroup;
    }
}
