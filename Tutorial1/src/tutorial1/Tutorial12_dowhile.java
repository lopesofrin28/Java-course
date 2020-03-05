/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Tutorial12_dowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter a Number");
        int value=0;
        do {   
            System.out.println("Enter a number");
             value=sc.nextInt();
               
        } while (value!=5);
            
        System.out.println("Got 5!");
         
    }
}
