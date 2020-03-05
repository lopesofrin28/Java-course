
package tutorial1;
class Machine36{
    public void start(){
        System.out.println("Starting Machine......");
    }
}
interface Plant36{
    public void grow();
            
}

public class Tutorial36_AnonymousClasses {
    public static void main(String[] args) {
        Machine36 machine1=new Machine36(){
            @Override public void start(){
                System.out.println("Camera Snapping....");
            }
        };
        machine1.start();
        
        Plant36 plant1=new Plant36() {
            @Override
            public void grow() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Plant Growing");
            }
        };
        plant1.grow();
    }
}
