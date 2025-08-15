import java.util.ArrayList;

public class listaCompras {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> precios = new ArrayList<>();

        productos.add("Naranja");
        productos.add("Uva");
        productos.add("Fideos");
        productos.add("Dulce");
        productos.add("Harina");

        precios.add(80);
        precios.add(60);
        precios.add(55);
        precios.add(45);
        precios.add(50);

        int total = 0;

        System.out.println(" Lista de compras:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i) + " - $" + precios.get(i));
            total += precios.get(i); 

        System.out.println("----------------------");
        System.out.println("Total: $" + total);
       }
    }
}