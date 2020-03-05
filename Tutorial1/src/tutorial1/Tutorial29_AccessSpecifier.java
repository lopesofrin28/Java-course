
package tutorial1;

import world.Tutorial29_Plant;

/*
* private --- only within same class
* public --- from anywhere
* protected --- subclass, and same package
* no modifier --  same package only
*/

public class Tutorial29_AccessSpecifier {
    public static void main(String[] args) {
        Tutorial29_Plant plant=new Tutorial29_Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        
        //Won't work  --- type is private 
       // System.out.println(plant.type);
       
       //size is protected; AccessSpecifier is not in the same package as Plant.
       //Won't work
       //System.out.println(plant.size);
       
       //Won't work; Accessspecifier and plant in different packages,height has package level visibility
       //System.out.println(plant.height);
    }
}
