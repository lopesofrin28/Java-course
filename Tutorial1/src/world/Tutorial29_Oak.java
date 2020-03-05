/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

public class Tutorial29_Oak extends Tutorial29_Plant{
    public Tutorial29_Oak(){
        //Won't work -- type is private
        //type="tree";
        
        //This works --- size is protected,Oak is a subclass of plant.
        this.size="large";
        
        //No access Specifier; works because Oak andPalnt are in same package
        this.height=10;
    }
}
