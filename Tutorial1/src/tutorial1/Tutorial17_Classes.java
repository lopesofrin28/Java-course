/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

class Person{
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
public class Tutorial17_Classes {
    public static void main(String[] args) {
     //   System.out.println("Hello");
     // System.out.println("There");
     
     Person p1=new Person();
     p1.name="joe Blogs";
     p1.age=37;
     p1.display();
     
     Person p2=new Person();
     p2.name="Sarah Smith";
     p2.age=20;
     p2.display();
     
        System.out.println(p1.name);
     
    }
}
