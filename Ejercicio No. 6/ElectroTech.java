import java.util.ArrayList;
import java.util.List;

public class ElectroTech {
    private List<DispositivoElectronico> dispositivos = new ArrayList<>();

    // Método para agregar un dispositivo a la lista de dispositivos
    public void agregarDispositivo(DispositivoElectronico dispositivo) {
        dispositivos.add(dispositivo);
    }

    // Método para desplegar información de todos los dispositivos
    public void desplegarInformacionDispositivos() {
        for (DispositivoElectronico dispositivo : dispositivos) {
            System.out.println(dispositivo.getInfo());
        }
    }

    // Método para validar el estado (encendido o apagado) de los dispositivos
    public void validarEstadoDispositivos() {
        for (DispositivoElectronico dispositivo : dispositivos) {
            if (dispositivo.estaEncendido()) {
                System.out.println("El dispositivo " + dispositivo.getInfo() + " está encendido.");
            } else {
                System.out.println("El dispositivo " + dispositivo.getInfo() + " está apagado.");
            }
        }
    }
}
