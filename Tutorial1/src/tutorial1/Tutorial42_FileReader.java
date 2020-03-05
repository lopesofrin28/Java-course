
package tutorial1;

import java.io.BufferedReader;
import java.io.File;
 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tutorial42_FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\kevin\\Documents\\NetBeansProjects\\Tutorial1\\src\\tutorial1\\text.txt");
        BufferedReader br=null;
        try {
          FileReader fr=new FileReader(file);
           br=new BufferedReader(fr);
            
            String line;
            
            while((line=br.readLine())!=null){
                 System.out.println(line);

            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+file.toString());
        }catch (IOException e){
            System.out.println("Unable to read file: "+file.toString());
        }finally{
                try {
                 br.close();
             } catch (IOException ex) {
                 System.out.println("Unable to close file: "+file.toString());
             } catch (NullPointerException ex){
     //            File was proably never opened!
             } 
        }
        
        
        
    }
}
