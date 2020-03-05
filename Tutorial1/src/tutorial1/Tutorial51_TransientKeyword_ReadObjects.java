
package tutorial1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial51_TransientKeyword_ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects...");
        
//        try(FileInputStream fi=new FileInputStream("test1.ser"); ObjectInputStream os=new ObjectInputStream(fi);){
        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("test1.ser")))    {
           
            
            Tutorial51_Person person=(Tutorial51_Person)os.readObject();
            System.out.println(person);
                                
            
           // os.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tutorial50_Serialization_Arrays_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tutorial50_Serialization_Arrays_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tutorial51_TransientKeyword_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
