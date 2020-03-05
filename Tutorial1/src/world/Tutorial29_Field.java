/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

public class Tutorial29_Field {
    private Tutorial29_Plant plant=new Tutorial29_Plant();
    
    public Tutorial29_Field(){
        
        //size is protected;Field is in the same package as Plant.
        System.out.println(plant.size);
        
    }
    
}
