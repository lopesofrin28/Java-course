
package tutorial1;


public class Tutorial48_Recursion {
    public static void main(String[] args) {
//        System.out.println("Hello");
          int value=4;
          System.out.println(calculate(value));
          
    }
    private static int  calculate(int value){
//        value=value-1;
//        System.out.println(value);
//        

//          System.out.println(value);
//          if (value==1 ) {
//            return; 
//        }
//          calculate(value-1);

        if (value==1) {
            return 1;
        }
//        return value*calculate(value-1);
        return calculate(value-1)*value;
    }
}
