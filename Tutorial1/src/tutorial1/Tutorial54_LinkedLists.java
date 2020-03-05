
package tutorial1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tutorial54_LinkedLists {
    public static void main(String[] args) {
        
        /*
        ArrayList manage array internally.
        [0][1][2][3][4][5]...
        */
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        
        /*
        LinkedList consist of elements where each element
        has a reference to previous and next element
        [0]->[1]->[2]->[3]->[4]->[5]
        */
        LinkedList<Integer> linkedList=new LinkedList<>();
        
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }
    private static void doTimings(String type,List<Integer> list){
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start=System.currentTimeMillis();
        
//        Add item at end of list 
//        for (int i = 0; i < 1E5; i++) {
//            list.add(i);
//            
//        }

//        Add items elsewhere in list
        for (int i = 0; i < 1E5; i++) {
           list.add(0 , i);
        }
        
        long end=System.currentTimeMillis();
        
        System.out.println("Time Taken: "+ (end-start) + " ms for " +type);
        
       // System.out.println(list);
    }
}
