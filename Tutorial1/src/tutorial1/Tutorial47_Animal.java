
package tutorial1;


public enum Tutorial47_Animal {
    CAT("Fergus"),DOG("Fido"),MOUSE("erry");
    
    private String name;
    
    Tutorial47_Animal(String name) {    
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This animal is called: "+ name;
    }
    
    
}
