/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.io.StringWriter;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Tutorial16_multidimensionalarray {
    public static void main(String[] args) {
        
        int[] values={3,5,234};
        System.out.println(values[2]);
        
        int[][] grid={{3,5,2343},
                      {2,4},
                      {1,2,3,4}
        };
        
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        
        String[][] texts=new String[2][3];
                
        texts[0][1]="Hello There";

        System.out.println(texts[0][1]);
        
        for (int row = 0; row <grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                    System.out.print(grid[row][col] + "\t");
                    
            }
            System.out.println();
        }
        String[][] words=new String[2][];
        
        System.out.println(words[0]);
        
        words[0]=new String[3];
        
        words[0][1]="hi there";
        
        System.out.println(words[0][1]);
        

    }
}
