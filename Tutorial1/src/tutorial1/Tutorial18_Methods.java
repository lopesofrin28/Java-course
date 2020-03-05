/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

class Person1{
    //Instance Variables (data or "state")/
    //Classes can contain
    //1.Data
    //2.Subroutines (Methods)
    
    String name;
    int age;

    public void display(){
        System.out.println("Name= "+name);
        System.out.println("Age= "+age);
    }
    
    
    
}
public class Tutorial18_Methods {
    public static void main(String[] args) {
         //   System.out.println("Hello");
     // System.out.println("There");
     
     Person1 p1=new Person1();
     p1.name="joe Blogs";
     p1.age=37;
     p1.display();
     
     Person1 p2=new Person1();
     p2.name="Sarah Smith";
     p2.age=20;
     p2.display();
     
        System.out.println(p1.name);
     
    }
}
