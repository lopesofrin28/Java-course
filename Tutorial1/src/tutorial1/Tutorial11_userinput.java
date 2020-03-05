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
public class Tutorial11_userinput {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner sc=new Scanner(System.in);
        
        //Output the prompt
        System.out.println("Enter a line of text:");
        
        //Wait for the user to enter a line of text
        String line=sc.nextLine();
        int value=sc.nextInt();
        
        //Tell them what they entered
        System.out.println("You entered:"+line);
        System.out.println("You entered:"+value);
    }
}
