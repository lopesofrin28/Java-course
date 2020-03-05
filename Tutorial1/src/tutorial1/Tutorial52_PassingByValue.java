
package tutorial1;

public class Tutorial52_PassingByValue {
    public static void main(String[] args) {
        Tutorial52_PassingByValue app=new Tutorial52_PassingByValue();
           
//        ==========================================
        int value=  8;  
        System.out.println("1. Value is: "+value);
      
        app.show(value);
        
        System.out.println("4. Value is: "+value);
//        ==========================================

        System.out.println("");
        
        Tutorial52_Person person=new Tutorial52_Person("Bob");
        System.out.println("1. Person is: "+person);
        app.show(person);
        
        System.out.println("4. Person is: "+person);

    }
    public void show(int value){
        System.out.println("2. Value is: "+value);
        
        value=9;
        System.out.println("3. Value is: "+value);

    }
    public  void show(Tutorial52_Person person){
        System.out.println("2. Person is: "+person);
        
        person=new Tutorial52_Person("Mike");
        
        System.out.println("3. Person is: "+person);


    }
    
    
}
