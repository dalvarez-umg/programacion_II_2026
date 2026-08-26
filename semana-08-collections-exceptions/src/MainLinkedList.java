import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();

        turnos.addLast("Turno 1");
        turnos.addLast("Turno 2");
        turnos.addLast("Turno 3");

        // Se coloca al inicio.
        turnos.addFirst("Emergencia");

        while (!turnos.isEmpty()) {
            String turno = turnos.removeFirst();

            System.out.println("Atendiendo: " + turno);
        }
    }
}