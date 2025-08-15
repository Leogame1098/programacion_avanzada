import java.util.ArrayList;
import java.util.Scanner;

public class Rifacorrec {
    ArrayList<Integer> nombres =new ArrayList< >();
    for(int i=1;i<=10;i++){
    nombres.add(nombres);

    public static void main(String[] args) {
        String[] nombres = new String[10]; 
        int disponibles = 10;
        int numeroElegido = 0;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Rifa 2do");

        while (disponibles > 0) {
            System.out.println("Elija un número (1 al 10):");

            
            for (int i = 0; i < 10; i++) {
                if (nombres[i] == null) {
                    System.out.print((i + 1) + " ");
                }
            }

            System.out.print("\nNúmero elegido: ");
            numeroElegido = sc.nextInt();
            sc.nextLine(); 

            if (numeroElegido < 1 || numeroElegido > 10) {
                System.out.println("Número fuera de rango. Intente de nuevo.");
                continue;
            }

            int index = numeroElegido - 1;
            if (nombres[index] != null) {
                System.out.println("Ese número ya fue elegido por " + nombres[index]);
            } else {
                System.out.print("Ingrese su nombre: ");
                nombres[index] = sc.nextLine();
                disponibles--;
                System.out.println("Número " + numeroElegido + " asignado con éxito.");
            }
        }
    }
    
}