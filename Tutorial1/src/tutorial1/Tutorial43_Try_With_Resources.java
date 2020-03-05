
package tutorial1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          System.out.println("Closing! ");
          throw new Exception("Oh no!");
    }
    
}
public class Tutorial43_Try_With_Resources {
    public static void main(String[] args) {
     
        try(  Temp temp=new Temp()){
          
      } catch (Exception ex) {
            Logger.getLogger(Tutorial43_Try_With_Resources.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
