package fichiers_code;

public class Campus {
    // Attributs
    private static Campus instance;

    // Constructor
    private Campus() {}

    // Methods
    public static Campus getInstance(String name) {
        if (instance == null) {
            // Création de l'instance si elle n'existe pas déjà
            instance = new Campus();
        }
        return instance;
    }
}
