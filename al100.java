import java.util.ArrayList;
import java.util.HashSet;


public class al100 {
    public static void main(String[] args) {


ArrayList < Integer > numeros=new ArrayList <>();
for (int i=0 ; i <= 100 ; i++ ){
    int random=(int)(Math.random()*10)+1;
    numeros.add(random);
}
HashSet <Integer> sinRepetidos=new HashSet<>();
sinRepetidos.addAll(numeros);

for(int num : sinRepetidos){
    System.out.println(num);
    
        }
    }    
}

// hash map ej; HashMap <object ,Objet >
// object no se repite 
// hashmap <intenger , Sring >
//1 , "juan"
//2 , "Perdro"

// 