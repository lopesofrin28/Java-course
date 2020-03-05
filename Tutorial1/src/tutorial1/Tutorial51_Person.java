
package tutorial1;

import java.io.Serializable;

public class Tutorial51_Person implements Serializable{
    
    private static final long serialVersionUID=4801633306273802062L;
    
    private int id;
    private String name;
    
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Tutorial51_Person.count = count;
    }

    public Tutorial51_Person(int id,String name) {
        this.id=id;
        this.name=name;
        
        System.out.println("Two-argument constructor");
    }

    @Override
    public String toString() {
        return "Tutorial51_Person{" + "id=" + id + ", name=" + name + '}'+" Count is: "+count;
    }

    
    
    
    
}

