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
public class Tutorial14_arrays {
    public static void main(String[] args) {
        int values[];
        values=new int[3];
        
        System.out.println(values[0]);
        
        values[0]=10;
        values[1]=20;
        values[2]=30;
        
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        
        int numbers[]={5,6,7};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }
    }
}
