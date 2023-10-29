public class Telefono implements DispositivoElectronico {
    private String modelo;       // Modelo del teléfono
    private boolean encendido;   // Estado de encendido (true si está encendido, false si está apagado)

    public Telefono(String modelo) {
        this.modelo = modelo;      // Inicializa el modelo del teléfono
        this.encendido = false;    // Inicializa el estado como apagado al crear una instancia
    }

    @Override
    public void encender() {
        encendido = true;           // Método para encender el teléfono, establece el estado como encendido (true)
    }

    @Override
    public void apagar() {
        encendido = false;          // Método para apagar el teléfono, establece el estado como apagado (false)
    }

    @Override
    public boolean estaEncendido() {
        return encendido;           // Método para verificar si el teléfono está encendido o apagado
    }

    @Override
    public String getInfo() {
        return "Teléfono Modelo: " + modelo + ", Encendido: " + estaEncendido();
        // Método para obtener información sobre el teléfono, incluyendo el modelo y el estado de encendido
    }
}