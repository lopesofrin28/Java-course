
package tutorial1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial51_WriteObjects {
    public static void main(String[] args) {
         System.out.println("Writing Objects...");
        
        
//        try(FileOutputStream fs=new FileOutputStream("test1.ser");ObjectOutputStream os=new ObjectOutputStream(fs)){                      
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("test1.ser"))){
           Tutorial51_Person person=new Tutorial51_Person(8,"Bob");
           Tutorial51_Person.setCount(88);
           os.writeObject(person);
           
//            os.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tutorial50_WriteObjects.class.getName()).log(Level.SEVERE, null, ex);  
        } catch (IOException ex) {
            Logger.getLogger(Tutorial50_WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
