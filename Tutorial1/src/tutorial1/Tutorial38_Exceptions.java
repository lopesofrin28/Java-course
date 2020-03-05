
package tutorial1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tutorial38_Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:/Users/kevin/Documents/NetBeansProjects/Tutorial1/src/tutorial1/example37.txt");

      
        try {
            FileReader fr=new FileReader(file);
            
//            This will not be executed if exception is thrown
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+file.toString());
        }
        System.out.println("Finished");
    }
}
