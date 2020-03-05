/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;


public class Tutorial29_Plant {
    //bad practice
    public String name;
    
    //Acceptable practice --- it's final
    public final static int ID=8;
    
    private String type;
    
    protected String size;
    
    int height;
    
    public Tutorial29_Plant(){
        this.name="Freddy";
        this.type="plant";
        this.size="Medium";
        this.height=8;
      
    }
}
