
package tutorial1;


public class Tutorial47_Enum {
//    public static final int DOG=0;
//    public static final int CAT=1;
//    public  static final int MOUSE=2;
//    
    
    public static void main(String[] args) {
        
        
        Tutorial47_Animal animal=Tutorial47_Animal.CAT;
//        int animal=CAT;
        
        switch(animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            default:
                break;
                
        }
        System.out.println(Tutorial47_Animal.DOG);
        System.out.println("Enum name as a string: "+Tutorial47_Animal.DOG.name());
        System.out.println(Tutorial47_Animal.DOG.getClass());
        System.out.println(Tutorial47_Animal.DOG instanceof Enum);
        System.out.println(Tutorial47_Animal.MOUSE.getName());
        
        Tutorial47_Animal animal2=Tutorial47_Animal.valueOf("CAT");
        System.out.println(animal2);
    }
} 
