
package tutorial1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Tutorial37_Scanner {
    public static void main(String[] args)throws FileNotFoundException{
//        (Use \\ instead of \ or use / instead of \)
        String fileName="C:/Users/kevin/Documents/NetBeansProjects/Tutorial1/src/tutorial1/example37.txt";
//        String fileName="example37.txt";

        File textFile=new File(fileName);
        
        Scanner sc=new  Scanner(textFile);
        
        int value=sc.nextInt();
        System.out.println("Read Value: "+value);
        
        sc.nextLine();
        
        int count=2;
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            
            System.out.println(count +": "+line);
            count++;
        }
        sc.close();
    }
}
