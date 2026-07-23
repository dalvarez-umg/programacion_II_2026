public class semana_03_while_3_continue {
    public static void main(String[] args) {
        int numero = 0;

        while (numero < 30) {
            numero++;
            if (numero % 3 == 0) {
                continue;
            }

            System.out.println(numero);
        }
    }
}
