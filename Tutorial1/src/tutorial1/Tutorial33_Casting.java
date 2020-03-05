package tutorial1;

//import javafx.scene.Camera;

class Machinex{
    public  void start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machinex{
    public void start(){
        System.out.println("Camera started");           
    }
    public void snap(){
        System.out.println("Photo taken");
    }
}



public class Tutorial33_Casting {
    public static void main(String[] args) {
        Machinex machine1=new Machinex();
        Camera camera1=new Camera();
        
        machine1.start();
        camera1.start();
        camera1.snap();
        
        //Upcasting
        Machinex machine2=camera1;
        machine2.start();
//      ERROR:machine2.snap();
        
//        DOWNCASTING
        Machinex machine3=new Camera();
        Camera camera2=(Camera)machine3;
        camera2.start();
        camera2.snap();
       // machine3.start();
       // Camera camera4=new Machinex();
       
       
       //Doesn't work --- runtime error
       Machinex machine4=new Machinex();
//       Camera camera3=(Camera)machine4;
//       camera3.start();
//       camera3.snap();

        
        
    }
}
