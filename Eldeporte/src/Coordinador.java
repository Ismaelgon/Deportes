import java.util.Date;

public class Coordinador extends Participante {
    public void eliminarDeportista() {
        // Lógica para eliminar un deportista
        System.out.println("Eliminando deportista");
    }

    public void añadirDeportista() {
        // Lógica para añadir un deportista
        System.out.println("Añadiendo deportista");
    }

    public Date programaPartido(Agenda calendario) {
        // Lógica para programar un partido
        System.out.println("Programando partido en la fecha: " + calendario.getFecha());
        return calendario.getFecha(); // Retorna la fecha del calendario
    }

    // Getters y Setters
}
