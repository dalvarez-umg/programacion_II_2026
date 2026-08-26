import java.util.HashMap;

public class MainHashMap {

    public static void main(String[] args) {
        HashMap<String, Double> precios = new HashMap<>();

        precios.put("P001", 25.50);
        precios.put("P002", 18.75);
        precios.put("P003", 42.00);

        String codigoBuscado = "P002";

        if (precios.containsKey(codigoBuscado)) {
            double precio = precios.get(codigoBuscado);

            System.out.println("Precio encontrado: Q" + precio);
        } else {
            System.out.println("Producto no encontrado.");
        }

        precios.remove("P001");

        System.out.println("Productos registrados: " + precios.size());
    }
}