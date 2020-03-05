/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

class Person2{
    String name;
    int age;
    
    void speak(){
        System.out.println("My Name is: "+name);
    }
    
    int calculateYearsToRetirement(){
    int yearsLeft=65-age;
       // System.out.println(yearsLeft);
       return yearsLeft;
    }
    int getAge(){
        return age;
    }
    String getName(){
       return name;
    }
}
public class Tutorial19_GetterandReturnValues {
    public static void main(String[] args) {
        Person2 p=new Person2();
        
        p.name="Joe";
        p.age=25;
        
      //  p.speak();
       int years= p.calculateYearsToRetirement();
        System.out.println("Years till retirement "+years);
        
        int age=p.getAge();
        String name=p.getName();
        
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
