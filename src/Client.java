public class Client {
    public static void main(String[] args) {
        // Accedemos a la instancia única del servidor de licencias
        LicenseServer server = LicenseServer.getInstance();

        System.out.println("Licencias disponibles: " + server.getAvailableLicenses());

        // Ciclo para consumir licencias
        for (int i = 0; i < 51; i++) {
            boolean success = server.consumeLicense();
            System.out.println("Consumo de licencia " + (i + 1) + ": " + (success ? "éxito" : "fallo"));
        }

        System.out.println("Licencias restantes: " + server.getAvailableLicenses());
    }
}
