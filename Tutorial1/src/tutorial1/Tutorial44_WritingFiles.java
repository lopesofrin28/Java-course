//How to write to a text file in java
package tutorial1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tutorial44_WritingFiles {
    public static void main(String[] args) {
           File file=new File("C:\\Users\\kevin\\Documents\\NetBeansProjects\\Tutorial1\\src\\tutorial1\\test44.txt");
        
        try(BufferedWriter br=new BufferedWriter(new FileWriter(file))){
           br.write("This is line one");
           br.newLine(); 
           br.write("This is line two");
           br.newLine();
           br.write("Last Line");
        } catch (IOException ex) {
//            Logger.getLogger(Tutorial42_App2.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("Unable to read file "+file.toString());
        }
        
    }
 
}
