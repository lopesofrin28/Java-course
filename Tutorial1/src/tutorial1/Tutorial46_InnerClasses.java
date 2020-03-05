
package tutorial1;

public class Tutorial46_InnerClasses {
    public static void main(String[] args) {
        Tutorial46_Robot robot=new Tutorial46_Robot(7);
        robot.start();
        
//         Tutorial46_Robot.Brain brain=robot.new Brain();
//        brain.think();

          Tutorial46_Robot.Battery battery=new Tutorial46_Robot.Battery();
          battery.charge();
    }
}
