public class semana_03_ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Con for aumentando de 2 en 2: ");
        for (int i = 2; i <= 50; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Con for de 1 en 1, usando el residuo: ");
        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
