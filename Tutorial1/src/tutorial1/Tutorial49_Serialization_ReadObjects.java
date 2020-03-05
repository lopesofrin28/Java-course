
package tutorial1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial49_Serialization_ReadObjects {
    public static void main(String[] args)  {
        System.out.println("Reading objects...");
        
       try( FileInputStream fi=new FileInputStream("people.bin")){
           ObjectInputStream os=new ObjectInputStream(fi);
           
           Tutorial49_Person person1=(Tutorial49_Person)os.readObject();
           Tutorial49_Person person2=(Tutorial49_Person)os.readObject();
           
           os.close();
           
           System.out.println(person1);
           System.out.println(person2);
       }
       catch (FileNotFoundException ex) {
            Logger.getLogger(Tutorial49_Serialization_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
       }catch (IOException ex) {
           Logger.getLogger(Tutorial49_Serialization_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tutorial49_Serialization_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
