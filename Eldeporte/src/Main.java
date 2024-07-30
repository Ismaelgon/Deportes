import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creación de objetos iniciales
        Coordinador coordinador = new Coordinador();
        TorneoFutbol torneo = new TorneoFutbol();
        Marcador marcador = new Marcador();
        Partido partido = new Partido();
        
        // Ejemplo de agregar un grupo al torneo
        System.out.println("Añadiendo un grupo al torneo...");
        torneo.añadirGrupo();
        
        // Ejemplo de programar un partido
        Agenda agenda = new Agenda();
        agenda.setFecha(new Date());
        agenda.setEvento("Partido de apertura");
        Date fechaPartido = coordinador.programaPartido(agenda);
        System.out.println("Partido programado para: " + fechaPartido);
        
        // Ejemplo de registrar un resultado
        marcador.registrarMarcador(3, 2);
        partido.registrarResultado(marcador);
        System.out.println("Resultado registrado: " + partido.obtenerResultado().mostrarMarcador());
        
        // Ejemplo de verificar y cambiar estado del partido
        System.out.println("Estado actual del partido: " + partido.verificarEstado());
        partido.cambiarEstado("Finalizado");
        System.out.println("Estado cambiado a: " + partido.verificarEstado());
        
        // Ejemplo de mostrar resultado del torneo
        torneo.añadirDeportista();
        Resultado resultado = torneo.obtenerResultado();
        resultado.calcularResultado();
        resultado.mostrarResultado();
        resultado.calcularPosicion();
        resultado.mostrarPosicion();
        
        // Finaliza el programa
        scanner.close();
    }
}
