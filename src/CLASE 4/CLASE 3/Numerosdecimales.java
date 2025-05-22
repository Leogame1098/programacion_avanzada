import java.util.Scanner;
public class Numerosdecimales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero decimal");

        Double num1 = entrada.nextDouble();
        System.out.println("Ingrese otro numero decimal");
        Double num2 = entrada.nextDouble();
        Double resultado = num1*num2;
        System.out.println("El reultado es "+ resultado);
    }
}
