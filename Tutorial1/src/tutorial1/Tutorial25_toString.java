/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
class Frog1{
    private  int id;
    private String name;

    public Frog1(int id,String name) {
        this.id=id;
        this.name=name;
    
    }
    
    
    
    public String toString(){
        
        return String.format("%-4d: %s",id,name);
        /*
        StringBuilder sb=new StringBuilder();
        sb.append(id).append(": ").append(name);
        
        return sb.toString();
      //  return id+": "+name;
        */
    }
}
public class Tutorial25_toString {
    public static void main(String[] args) {
      //  Object obj=new Object();
        Frog1 frog11=new Frog1(7,"Freddy");
        Frog1 frog22=new  Frog1(5, "Roger");
        System.out.println(frog11);
        System.out.println(frog22);
        
        }
}
