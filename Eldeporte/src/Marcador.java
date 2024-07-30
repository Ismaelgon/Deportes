public class Marcador {
    private int golesLocal;
    private int golesVisitante;

    public void registrarMarcador(int golesLocal, int golesVisitante) {
        // Lógica para registrar el marcador del partido
        System.out.println("Registrando marcador: " + golesLocal + " - " + golesVisitante);
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String mostrarMarcador() {
        // Lógica para mostrar el marcador del partido
        return "Marcador: " + golesLocal + " - " + golesVisitante;
    }

    // Getters y Setters
}
