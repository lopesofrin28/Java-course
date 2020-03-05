package tutorial1;


public class Tutorial41_AbstractClasses {
    public static void main(String[] args) {
         Tutorial41_Camera cam1=new Tutorial41_Camera();
         cam1.setId(5);
         
         Tutorial41_Car car1=new Tutorial41_Car();
         car1.setId(4);
//         int a=car1.getId();
//         System.out.println(a);
            
            car1.run();
//         Tutorial41_Machine machine1=new Tutorial41_Machine();
    }
}
