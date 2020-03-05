
package tutorial1;

import java.io.Serializable;

public class Tutorial49_Person implements Serializable{
//    private static final long serialVersionUID=Long.BYTES;
    private int id;
    private String name;

    public Tutorial49_Person(int id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Tutorial49_Person{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
