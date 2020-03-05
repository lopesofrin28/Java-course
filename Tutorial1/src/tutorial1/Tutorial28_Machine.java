/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

public class Tutorial28_Machine implements Tutorial28_Info{
    private int id=7;
    
     public void start(){
        System.out.println("Machine started");
    }

  
    public void showInfo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Machine Id is:"+id);
    }
}
