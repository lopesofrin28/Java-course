
package tutorial1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial50_Serialization_Arrays_ReadObjects {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Reading Objects...");
        
        try(FileInputStream fi=new FileInputStream("test.ser")){
            
            ObjectInputStream os=new ObjectInputStream(fi);
            
            Tutorial50_Person[] people=(Tutorial50_Person[])os.readObject();
            
            @SuppressWarnings("unchecked")
            ArrayList<Tutorial50_Person> peopleList=(ArrayList<Tutorial50_Person>)os.readObject();
                                   
            for(Tutorial50_Person person:people){   
                System.out.println(person);
            }
            
            for(Tutorial50_Person person: peopleList){
                System.out.println(person);
            }
            
            int num= os.readInt();
            
            for (int i = 0; i < num; i++) {
                Tutorial50_Person person=(Tutorial50_Person)os.readObject();
                System.out.println(person);               
            }
            
            os.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tutorial50_Serialization_Arrays_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tutorial50_Serialization_Arrays_ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
