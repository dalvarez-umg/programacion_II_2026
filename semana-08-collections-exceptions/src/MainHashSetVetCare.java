import java.util.HashSet;

public class MainHashSetVetCare {

    public static void main(String[] args) {
        HashSet<String> codigosRegistrados = new HashSet<>();

        registrarCodigo(codigosRegistrados,"VET-001");
        registrarCodigo(codigosRegistrados,"VET-002");
        registrarCodigo(codigosRegistrados,"VET-003");

        // Intento duplicado.
        registrarCodigo(codigosRegistrados,"VET-001");

        System.out.println("\nCódigos almacenados:");

        for (String codigo : codigosRegistrados) {
            System.out.println(codigo);
        }
    }

    public static void registrarCodigo(HashSet<String> codigosRegistrados, String codigo) {
        boolean agregado = codigosRegistrados.add(codigo);

        if (agregado) {
            System.out.println("Código registrado: " + codigo);
        } else {
            System.out.println("El código ya existe: " + codigo);
        }
    }
}