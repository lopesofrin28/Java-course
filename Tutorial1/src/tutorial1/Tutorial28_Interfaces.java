/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;


public class Tutorial28_Interfaces {
    public static void main(String[] args) {
        Tutorial28_Machine mach1=new Tutorial28_Machine();
        mach1.start();
        
        Tutorial28_Person person1=new Tutorial28_Person("Bob");
        person1.greet();
        
        Tutorial28_Info info1=new Tutorial28_Machine();
        info1.showInfo();
        
        Tutorial28_Info info2=person1;
        info2.showInfo();
        
        System.out.println("");
        
        outputInfo(mach1);
        outputInfo(person1);
    }
        private static void outputInfo(Tutorial28_Info info){
            info.showInfo();
        }
        
       
   // }
}
