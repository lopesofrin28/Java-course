 
package tutorial1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial39_Multiple_Exceptions {
    public static void main(String[] args) {
            Tutorial39_Test test=new Tutorial39_Test();
            
            
            /*
            try {
            test.run();
            } catch (IOException ex) {
            Logger.getLogger(Tutorial39_Multiple_Exceptions.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
            System.out.println("Couldn't parse command file.");
            }
            */
            
            /*
            try {
            test.run();
            } catch (IOException |ParseException ex) {
            //TODO Auto-generated catch block
            }
            */

        try {
            test.run();
        } catch (Exception ex) {
            Logger.getLogger(Tutorial39_Multiple_Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        } 
        try {
            test.input();
        }catch(FileNotFoundException ex){
            System.out.println("not found");  
        }
        catch (IOException ex) {
            Logger.getLogger(Tutorial39_Multiple_Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
