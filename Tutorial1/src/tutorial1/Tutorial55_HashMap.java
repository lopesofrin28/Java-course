
package tutorial1;

import java.util.HashMap;
import java.util.Map;


public class Tutorial55_HashMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        
        map.put(5,"Five");
        map.put(8,"Eight");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");
        
       // System.out.println(map.get(8));
//       String text=map.get(5);
//        System.out.println(text);
//        

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key +" :"+ value);
            
        }
        
    }
}
