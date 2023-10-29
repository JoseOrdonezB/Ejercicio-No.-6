public interface DispositivoElectronico {
    // Método para encender el dispositivo electrónico
    public void encender();

    // Método para apagar el dispositivo electrónico
    public void apagar();

    // Método para verificar si el dispositivo electrónico está encendido
    public boolean estaEncendido();

    // Método para obtener información sobre el dispositivo electrónico
    public String getInfo();
}