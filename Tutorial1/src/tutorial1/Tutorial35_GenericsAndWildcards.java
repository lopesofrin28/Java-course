
package tutorial1;
import java.util.ArrayList;


class Machine35{

    @Override
    public String toString() {
        return "I am a Machine";
    }
    public void start(){
        System.out.println("Machine Starting");
    }
    
}
class Camera35 extends Machine35{

    @Override
    public String toString() {
        return "I am a camera";
    }
    public void snap(){
        System.out.println("Taking Photo");
    }
    
}

public class Tutorial35_GenericsAndWildcards {
    public static void main(String[] args) {
        ArrayList<Machine35> list1=new ArrayList<Machine35>();
        list1.add(new Machine35());
        list1.add(new Machine35());
        
       
        
        ArrayList<Camera35> list2=new ArrayList<Camera35>();
        list2.add(new Camera35());
        list2.add(new Camera35());
        
       showList1(list2);
       showList2(list1);
       showList3(list1);
    }   
    
    public static void showList1(ArrayList<? extends Machine35> list1) {
        for ( Machine35  value : list1) {
            System.out.println(value);
            value.start();
        }
    }
    public static void showList2(ArrayList<? super Camera35> list1) {
        for ( Object  value : list1) {
            System.out.println(value);
            //value.snap();
        }
    }
    public static void showList3(ArrayList<?> list1) {
        for ( Object  value : list1) {
            System.out.println(value);
            //value.snap();
        }
    }
}
