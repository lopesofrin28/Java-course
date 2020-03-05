
package tutorial1;

public class Tutorial52_Person {
    private String name;

    public Tutorial52_Person(String name) {
        this.name=name;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tutorial52_Person{" + "name=" + name + '}';
    }
    
    
    
   
}
