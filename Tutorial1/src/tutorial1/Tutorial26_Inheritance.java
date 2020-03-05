/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1; 

public class Tutorial26_Inheritance {
    public static void main(String[] args) {
        Tutorial26_Machine mach1=new Tutorial26_Machine();
        mach1.start();
        mach1.stop();
        
        Tutorial26_Car car1=new Tutorial26_Car();
        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
        
    }
 
}
