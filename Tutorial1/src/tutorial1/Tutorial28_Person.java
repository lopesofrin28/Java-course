/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

public class Tutorial28_Person implements Tutorial28_Info{
    private String name;
    
    public Tutorial28_Person(String name){
        this.name=name;
    }
    public  void greet() {
        System.out.println("Hello There");
    }

  
    public void showInfo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Person name is: "+name);
    }
}
