import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ElectroTech para administrar los dispositivos.
        ElectroTech electroTechStore = new ElectroTech();

        // Crear una instancia de CSVReader para cargar dispositivos desde un archivo CSV.
        CSVReader csvManager = new CSVReader();

        // Cargar dispositivos desde un archivo CSV llamado "dispositivos.csv".
        csvManager.cargarDispositivosDesdeCSV("dispositivos.csv", electroTechStore);

        // Crear un objeto Scanner para recibir la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar información de dispositivos");
            System.out.println("2. Validar estado de dispositivos");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            // Leer la opción elegida por el usuario.
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar información de los dispositivos.
                    electroTechStore.desplegarInformacionDispositivos();
                    break;
                case 2:
                    // Validar el estado de los dispositivos.
                    electroTechStore.validarEstadoDispositivos();
                    break;
                case 3:
                    // Salir del programa.
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 3); // Continuar hasta que el usuario seleccione la opción 3 (Salir).

        // Cerrar el Scanner al final del programa para liberar recursos.
        scanner.close();
    }
}