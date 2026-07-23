import java.util.Scanner;

public class semana_03_practica_guiada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Calcular total de compra");
            System.out.println("2. Validar nota");
            System.out.println("3. Mostrar tabla de multiplicar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese precio del producto: Q");
                    double precio = entrada.nextDouble();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad = entrada.nextInt();

                    double total = precio * cantidad;

                    if (total >= 250) {
                        double descuento = total * 0.10;
                        total = total - descuento;
                        System.out.println("Se aplicó 10% de descuento.");
                    }

                    System.out.println("Total a pagar: Q" + total);
                    break;
                case 2:
                    System.out.print("Ingrese nota: ");
                    int nota = entrada.nextInt();

                    if (nota < 0 || nota > 100) {
                        System.out.println("Nota inválida.");
                    } else if (nota >= 90) {
                        System.out.println("Excelente.");
                    } else if (nota >= 75) {
                        System.out.println("Muy bien.");
                    } else if (nota >= 61) {
                        System.out.println("Aprobado.");
                    } else {
                        System.out.println("Reprobado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese número: ");
                    int numero = entrada.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();
        } while (opcion != 4);

        entrada.close();
    }
}