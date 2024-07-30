public abstract class Participante {
    private String nombre;
    private String apellido;
    private String id;
    private String edad;
    private String genero;
    private String telefono;

    public void registrar() {
        // Lógica para registrar un participante
        System.out.println("Registrando participante: " + nombre);
    }

    public void inscribir() {
        // Lógica para inscribir un participante
        System.out.println("Inscribiendo participante: " + nombre);
    }

    // Getters y Setters
}
