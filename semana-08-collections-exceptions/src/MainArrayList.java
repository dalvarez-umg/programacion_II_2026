import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("María");

        System.out.println("Primer estudiante: "+ estudiantes.get(0));

        estudiantes.remove("Carlos");

        System.out.println("\nEstudiantes registrados:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("Total: " + estudiantes.size());
    }
}