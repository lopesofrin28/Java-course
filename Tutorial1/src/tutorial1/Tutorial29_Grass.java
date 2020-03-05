/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import world.Tutorial29_Plant;


public class Tutorial29_Grass extends Tutorial29_Plant{
    public  Tutorial29_Grass(){
        //Won't work --- Grass not in same package as plant,eventhough its a suclass
        //System.out.println(this.height);
    }
}
