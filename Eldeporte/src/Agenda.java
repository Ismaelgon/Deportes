import java.util.Date;

public class Agenda {
    private String evento;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void asignarJuez() {
        // Lógica para asignar un juez a un evento
        System.out.println("Asignando juez al evento: " + evento);
    }
}
