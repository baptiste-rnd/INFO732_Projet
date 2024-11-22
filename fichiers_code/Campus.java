package fichiers_code;

public class Campus {
    // Attributs
    private static Campus instance;
    private static CampusGroup campusGroup;

    // Constructor
    private Campus() {
    }

    // Methods
    public static Campus getInstance() {
        if (instance == null) {
            instance = new Campus();
        }
        if (campusGroup == null) {
            campusGroup = new CampusGroup("Groupe Campus");
        }
        return instance;
    }

    public CampusGroup getCampusGroup() {
        return campusGroup;
    }
}
