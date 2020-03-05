
package tutorial1;

import java.util.ArrayList;
import java.util.List;

public class Tutorial53_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList <Integer>();
        
//        Adding
          numbers.add(10);
          numbers.add(100);
          numbers.add(40);
          
//        Retrieving
          System.out.println(numbers.get(0));
          
          System.out.println("\n Iteration #1: ");
//        Indexed for loop iterations
          for (int i = 0; i < numbers.size(); i++) {
              System.out.println(numbers.get(i));
        }
          
          System.out.println("\n Iteration #2: ");
          for (Integer value : numbers) {
              System.out.println(value);
        }
         
//          Removing items (Careful!)
          numbers.remove(numbers.size()-1);
          
//          This is very SLOW
          numbers.remove(0);
          
         System.out.println("\n Iteration #3: ");
          for (Integer value : numbers) {
              System.out.println(value);
        }
          
//          List interface ...
          List<String> values=new ArrayList<String>();
          values.add("hi");
          values.add("hello");
          
          System.out.println(values);
    }
}
