 
package tutorial1;

import java.util.Objects;

class Person45{
    private int id;
    private String name;
    public Person45(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person45{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person45 other = (Person45) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}

public class Tutorial45_EqualsMethod {
    public static void main(String[] args) {
//        Person45 person1=new Person45(5, "Bob");
//        Person45 person2=new Person45(8,"Sue" );
////        System.out.println(person2.toString());
//        person2=person1; 
////        System.out.println(person2.toString());
//
//        System.out.println(person1 == person2);


        System.out.println(new Object());
         Person45 person1=new Person45(5,"bob" );
         Person45 person2=new Person45(5,"bob" );
         
         System.out.println(person1.equals(person2));

         Double value1=7.2;
         Double value2=7.2;
         
         System.out.println(value1.equals(value2));
         
         Integer number1=6;
         Integer number2=6;
         
         System.out.println(number1==number1);
         
         String text1="hello";
         String text2="hellodfdaf".substring(0,5);
         
         System.out.println(text2);
         
         System.out.println(text1==text2);
    }
}
