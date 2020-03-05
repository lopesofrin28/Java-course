
package tutorial1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Tutorial49_WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");
        
        Tutorial49_Person mike=new Tutorial49_Person(543,"Mike");
        Tutorial49_Person sue=new Tutorial49_Person(123,"Sue");
        
        System.out.println(mike);
        System.out.println(sue);
        
        try(FileOutputStream fs=new FileOutputStream("people.bin")){
            ObjectOutputStream os=new ObjectOutputStream(fs);
            
            os.writeObject(mike);
            os.writeObject(sue);
            
            os.close();
            
        }catch(FileNotFoundException e){
//            System.out.println("");
            e.printStackTrace();
        }catch(IOException e){
//            System.out.println("");
            e.printStackTrace();
        }
    }
}
