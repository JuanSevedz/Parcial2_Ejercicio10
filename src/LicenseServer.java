public class LicenseServer {

    // Atributo estático que contiene la única instancia
    private static LicenseServer instance;

    // Atributo de negocio (ejemplo: cantidad de licencias disponibles)
    private int licenseCount;

    // Constructor privado (nadie puede instanciar desde fuera)
    private LicenseServer() {
        // Inicializamos con un número fijo de licencias
        this.licenseCount = 50;
    }

    // Método público y estático para obtener la única instancia
    public static synchronized LicenseServer getInstance() {
        if (instance == null) {
            instance = new LicenseServer();
        }
        return instance;
    }

    // Método que consume una licencia si hay disponibles
    public boolean consumeLicense() {
        if (licenseCount > 0) {
            licenseCount--;
            return true;
        }
        return false;
    }

    // Método que devuelve la cantidad de licencias restantes
    public int getAvailableLicenses() {
        return licenseCount;
    }
}
