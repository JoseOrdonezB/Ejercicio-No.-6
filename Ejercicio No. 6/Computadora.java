public class Computadora implements DispositivoElectronico {
    private String marca;        // Marca de la computadora
    private boolean encendida;   // Estado de encendido (true si está encendida, false si está apagada)

    public Computadora(String marca) {
        this.marca = marca;      // Inicializa la marca de la computadora
        this.encendida = false;  // Inicializa el estado como apagado al crear una instancia
    }

    @Override
    public void encender() {
        encendida = true;       // Método para encender la computadora, establece el estado como encendido (true)
    }

    @Override
    public void apagar() {
        encendida = false;      // Método para apagar la computadora, establece el estado como apagado (false)
    }

    @Override
    public boolean estaEncendido() {
        return encendida;       // Método para verificar si la computadora está encendida o apagada
    }

    @Override
    public String getInfo() {
        return "Computadora Marca: " + marca + ", Encendida: " + estaEncendido();
        // Método para obtener información sobre la computadora, incluyendo la marca y el estado de encendido
    }
}
