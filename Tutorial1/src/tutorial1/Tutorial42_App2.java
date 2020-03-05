
package tutorial1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tutorial42_App2 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\kevin\\Documents\\NetBeansProjects\\Tutorial1\\src\\tutorial1\\text.txt");
        
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Tutorial42_App2.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("Can't find file "+file.toString());
        } catch (IOException ex) {
//            Logger.getLogger(Tutorial42_App2.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("Unable to read file "+file.toString());
        }
        
    }
}
