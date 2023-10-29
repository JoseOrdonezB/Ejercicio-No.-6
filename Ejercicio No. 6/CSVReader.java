import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    // Método para cargar dispositivos desde un archivo CSV y agregarlos a ElectroTech
    public void cargarDispositivosDesdeCSV(String nombreArchivo, ElectroTech electroTech) {
        List<String[]> lines = new ArrayList<>();

        // Intenta abrir y leer el archivo CSV
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Procesar cada línea del archivo CSV
        for (String[] parts : lines) {
            if (parts.length == 2) {
                String className = parts[0].trim();      // Obtiene el nombre de la clase (Telefono o Computadora)
                String deviceInfo = parts[1].trim();     // Obtiene la información del dispositivo

                // Crea una instancia de DispositivoElectronico según la clase y la información
                DispositivoElectronico dispositivo = createDeviceInstance(className, deviceInfo);

                // Si se creó una instancia válida, agrégala a ElectroTech
                if (dispositivo != null) {
                    electroTech.agregarDispositivo(dispositivo);
                }
            }
        }
    }

    // Método para crear una instancia de DispositivoElectronico según la clase y la información
    private DispositivoElectronico createDeviceInstance(String className, String deviceInfo) {
        if (className.equals("Telefono")) {
            String[] parts = deviceInfo.split(", ");
            String modelo = parts[0].substring(parts[0].indexOf(":") + 2); // Obtiene el modelo del dispositivo
            boolean encendido = Boolean.parseBoolean(parts[1].substring(parts[1].indexOf(":") + 2)); // Obtiene el estado de encendido
            Telefono telefono = new Telefono(modelo);
            if (encendido) {
                telefono.encender(); // Enciende el teléfono si está encendido
            }
            return telefono;
        } else if (className.equals("Computadora")) {
            String[] parts = deviceInfo.split(", ");
            String marca = parts[0].substring(parts[0].indexOf(":") + 2); // Obtiene la marca del dispositivo
            boolean encendida = Boolean.parseBoolean(parts[1].substring(parts[1].indexOf(":") + 2)); // Obtiene el estado de encendido
            Computadora computadora = new Computadora(marca);
            if (encendida) {
                computadora.encender(); // Enciende la computadora si está encendida
            }
            return computadora;
        }
        return null; // Devuelve null si no se puede crear una instancia válida
    }
}