import java.util.ArrayList;
import java.util.Scanner;
public class Estud {
    public static void main(String[] args){
                Scanner entrada = new Scanner(System.in);
                int opcion = 5; 1
                String estudiante = "";
                ArrayList<String>estudiantes = new ArrayList<>();

//hacer un programa que permita agregar estudiantes, buscar por nombre, mostrar la lista ordenada alfabeticamente y eliminar estudiantes
        while(opcion!=0){ 
                 System.out.println("Las opciones son: ");
                 System.out.println("1 para agregar estudiantes");
                 System.out.println("2 para buscar un estudiante");
                 System.out.println("3 para mostrar la lista");
                 System.out.println("4 para eliminar estudiantes");
                 System.out.println("0 para SALIR");
                opcion=entrada.nextInt();

                if(opcion==1){ 
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante a agregar");
                
                 estudiante = entrada.nextLine();
                 if(estudiantes.contains(estudiante)){
                    System.out.println("Este estudiante ya existe");
                 }else{
                        estudiantes.add(estudiante.toUpperCase());
                 System.out.println("Estudiante agregado con exito");
                }
                }else if(opcion==2){
                entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante a buscar");
                    estudiante=entrada.nextLine();
                    
                    System.out.println(estudiantes.contains(estudiante.toUpperCase())? "Si esta el estudiante: "+estudiante : "No existe el estudiante: "+estudiante );

                }else if(opcion==3){
                    if(estudiantes.size()==0){
                        System.out.println("No hay estudiantes");
                    }else{ 
                    System.out.println("Los estudiantes son: ");
                    for(int i=0; i<estudiantes.size(); i++){
                        System.out.println(estudiantes.get(i));
                    }
                }
                }else if(opcion==4){
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante a eliminar");
                    estudiante=entrada.nextLine().toUpperCase();
                    if(estudiantes.contains(estudiante)){
                        estudiantes.remove(estudiante);
                        System.out.println("Estudiante eliminado");
                    }else{
                        System.out.println("Este estudiante no existe");
                    }
                    
                    

                }
            }
            System.out.println("Programa terminado");




    }       
}