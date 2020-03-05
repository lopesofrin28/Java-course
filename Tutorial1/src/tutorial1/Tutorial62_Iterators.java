package tutorial1;

import java.util.Iterator;
import java.util.LinkedList;


public class Tutorial62_Iterators {
    public static void main(String[] args) {
         LinkedList<String> animals=new LinkedList<>();
         
         animals.add("fox");
         animals.add("cat");
         animals.add("dog");
         animals.add("rabbit");
         
         
         Iterator<String> it=animals.iterator();
         
         while (it.hasNext()) {                         
            String value=it.next();
            System.out.println(value);
            
             if (value.equals("cat")) {
                 it.remove();
                 
             }
        }
         
         System.out.println("");
         
         
//         Modern Iterator,Post Java 5.
         for (String animal : animals) {
             System.out.println(animal);
        }
    }
}
