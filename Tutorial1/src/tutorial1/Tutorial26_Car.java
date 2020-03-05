/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
public class Tutorial26_Car extends Tutorial26_Machine{
    @Override 
    public void start(){
        super.start();
        System.out.println("Car Started");
    }
     public void wipeWindShield(){
        System.out.println("Wiping WindShield");
        
    }
     public void showInfo(){
         System.out.println("Car name: "+name);
     }
}
