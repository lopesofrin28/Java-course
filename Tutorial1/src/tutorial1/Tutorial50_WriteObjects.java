
package tutorial1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial50_WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects...");
        
        Tutorial50_Person[] people={new Tutorial50_Person(1,"Sue"),new Tutorial50_Person(99,"Mike"),new  Tutorial50_Person(7,"Bob")};
        
        ArrayList<Tutorial50_Person> peopleList=new ArrayList<Tutorial50_Person>(Arrays.asList(people));
        try(FileOutputStream fs=new FileOutputStream("test.ser")){
            
            ObjectOutputStream os=new ObjectOutputStream(fs);
            
            os.writeObject(people);
            
            os.writeObject(peopleList);
            
            os.writeInt(peopleList.size());
            
            for(Tutorial50_Person person: peopleList){
                os.writeObject(person);
            }
            
            os.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tutorial50_WriteObjects.class.getName()).log(Level.SEVERE, null, ex);  
        } catch (IOException ex) {
            Logger.getLogger(Tutorial50_WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
