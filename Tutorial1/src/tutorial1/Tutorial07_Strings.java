/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.io.IOException;

/**
 *
 * @author kevin
 */
public class Tutorial07_Strings{
    public static void main(String[] args)throws IOException{
       int myInt=7;
       String text="Hello";
       String blank=" ";
       String name="Bob";
        
       String greeting=text+blank+name;
        System.out.println(greeting);
        System.out.println("My integer is:"+myInt);
        
        System.out.println(text+blank+name);
        
        double d=7.9;
        System.out.println("My number is:"+d+".");
    }
}
