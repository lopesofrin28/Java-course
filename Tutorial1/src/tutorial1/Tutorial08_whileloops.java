/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;/**
 *
 * @author kevin
 */
public class Tutorial08_whileloops {
    public static void main(String[] args) {
       int value=0;
        boolean loop=value>20;
        
        while (value<10) {            
            System.out.println("hello " +value);
            value=value+1;
          // value+=1;
        }
       // System.out.println(loop);
    }
}
