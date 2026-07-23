public class semana_03_while_2_break {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            if (numero == 37) {
                System.out.println("Se encontró el número 37.");
                break;
            }

            System.out.println(numero);
            numero++;
        }
    }
}
