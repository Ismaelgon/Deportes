import java.util.Date;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private Marcador marcador;
    private String estado;
    private Date fecha;

    public void registrarResultado(Marcador marcador) {
        // Lógica para registrar el resultado del partido
        System.out.println("Registrando resultado: " + marcador.mostrarMarcador());
        this.marcador = marcador;
    }

    public Marcador obtenerResultado() {
        // Lógica para obtener el resultado del partido
        System.out.println("Obteniendo resultado del partido");
        return marcador;
    }

    public String verificarEstado() {
        // Lógica para verificar el estado del partido
        System.out.println("Verificando estado del partido");
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        // Lógica para cambiar el estado del partido
        System.out.println("Cambiando estado del partido a: " + nuevoEstado);
        this.estado = nuevoEstado;
    }

    // Getters y Setters
}
