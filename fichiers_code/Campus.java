package fichiers_code;

public class Campus {
    // Attributs
    private static Campus instance;

    // Constructor
    private Campus() {}

    // Methods
    public static Campus getInstance(String name) {
        if (instance == null) {
            instance = new Campus();
        }
        return instance;
    }
}
