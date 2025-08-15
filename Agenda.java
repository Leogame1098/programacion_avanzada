//Ejercicio 1: Agenda telefonica
//* crear un programa que Use hashmap para almacenar nombres y telefono 
// permita agregar nuevo contacto 
// busque telefono por nombre 
// actualice numeros existentes 
// Eliminar Contactos 
// Muestre todos los contactos 
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Agenda {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        HashMap<String, Integer> telefono = new HashMap<>();

        int opciones = -100;
        String contacto = "";
        int numero = 0;

        while(opciones != 0){
            System.out.println("Las opciones son: ");
            System.out.println("1. Ingresar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("0. Salir");
            opciones = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            if(opciones == 1){ 
                System.out.print("Ingrese el nombre del contacto: ");
                contacto = entrada.nextLine();
                System.out.print("Ingrese el telefono: ");
                numero = entrada.nextInt();
                telefono.put(contacto, numero);
                System.out.println("Contacto agregado");

            } else if (opciones == 2) {
                System.out.print("Ingrese el nombre del contacto: ");
                contacto = entrada.nextLine();
                if (telefono.containsKey(contacto)) {
                    System.out.println("El contacto se llama: " + contacto + " y su número es: " + telefono.get(contacto));
                } else {
                    System.out.println("No se encontró el contacto");
                }

            } else if (opciones == 3) {
                System.out.print("Ingrese el contacto a actualizar: "); 
                contacto = entrada.nextLine();
                if(telefono.containsKey(contacto)) {
                    System.out.print("Ingrese el nuevo número: ");
                    numero = entrada.nextInt();
                    telefono.put(contacto, numero);      
                    System.out.println("Contacto actualizado");
                } else {
                    System.out.println("No se encontró el contacto");
                }

            } else if (opciones == 4) {
                System.out.print("Ingrese el nombre del contacto a eliminar: ");
                contacto = entrada.nextLine();
                if (telefono.containsKey(contacto)){
                    telefono.remove(contacto);
                    System.out.println("Contacto eliminado");
                } else {
                    System.out.println("No se encontró el contacto");
                }

            } else if (opciones == 5) {
                if (telefono.isEmpty()) {
                    System.out.println("No hay contactos");
                } else {
                    for (Map.Entry<String, Integer> entry : telefono.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }

            } else if (opciones == 0) {
                System.out.println("Saliendo");

            } else {
                System.out.println("Opción inválida");
            }
        }
    }
}
