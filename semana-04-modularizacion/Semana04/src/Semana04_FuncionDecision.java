public class Semana04_FuncionDecision {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 14;
        if(esPar(numero)) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
