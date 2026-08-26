import java.util.HashSet;

public class MainHashSet {

    public static void main(String[] args) {
        HashSet<String> correos = new HashSet<>();

        System.out.println(correos.add("ana@correo.com"));
        System.out.println(correos.add("carlos@correo.com"));
        System.out.println(correos.add("ana@correo.com"));

        System.out.println("\nCorreos registrados:");
        for (String correo : correos) {
            System.out.println(correo);
        }

        System.out.println("Total: " + correos.size());
    }
}