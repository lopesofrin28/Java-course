/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author kevin
 */
public class Tutorial10_ifstatements {
    public static void main(String[] args) {
//        boolean condition=1<6;
//        boolean cond1=5!=2;
//        boolean cond2=1>3;
//        boolean cond3= 4==3;
//        System.out.println(condition);
//        System.out.println(cond1);
//        System.out.println(cond2);
//        System.out.println(cond3);

        int myInt=15;
        if (myInt<10) {
            System.out.println("yes,It's true!");
        }
        else if(myInt>20){
        System.out.println("no its false");
    }
        else{
            System.out.println("None of the above");
        }
    }
}
