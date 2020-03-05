/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: "+height);
    }
    public void move(String direction,double distance){
        System.out.println("Moving "+distance+" metres in direction "+direction);
    }
}
public class Tutorial20_MethodParameters {
    public static void main(String[] args) {
        Robot sam=new Robot();
        sam.speak("Hi I'm sam");
         sam.jump(7);
         
         sam.move("West", 12.2);
         
         String greeting="Hello there";
         
         sam.speak(greeting);
         
         int value=14;
         sam.jump(14);
    }
}
