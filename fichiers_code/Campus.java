package fichiers_code;

// Singleton bien
// Cependant, CampusGroup aurait pu être directement le singleton étant donné que les announcements ne sont
// pas stocké dans Campus contrairement à ce que le diagramme de classe indique.
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
