/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
class Machine{
    private String name;
    private int code;
    public Machine(){
       // System.out.println("Constructor running!");
      this("Arnie",0);
        //name="Arnie";
    }
    public Machine(String name){
        System.out.println("Second constructor running");
        this.name=name;
        
    }
    public Machine(String name,int code){
        System.out.println("Third Constructor running");
        this.name=name;
        this.code=code;
    }
}
public class Tutorial22_Constructors {
    public static void main(String[] args) {
     Machine machine1=new Machine();
     Machine machine2=new Machine("Bertie");
     Machine machine3=new Machine("Chalky",7);
     
     
     
    }
  
}
