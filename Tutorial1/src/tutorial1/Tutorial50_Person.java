
package tutorial1;

import java.io.Serializable;

public class Tutorial50_Person implements  Serializable{
    
    private static final long serialVersionUID=4801633306273802062L;
    
    private int id;
    private String name;

    public Tutorial50_Person(int id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Tutorial50_Person{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
