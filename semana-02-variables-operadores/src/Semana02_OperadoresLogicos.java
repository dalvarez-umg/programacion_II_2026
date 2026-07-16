public class Semana02_OperadoresLogicos {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneDocumento = true;

        boolean puedeIngresar = edad >= 18 && tieneDocumento;

        System.out.println(puedeIngresar);
    }
}
