
package tutorial1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person59{
    private int id;
    private String name;

    public Person59(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name; 
    }
    
}


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        
        if (len1 > len2) {
            return 1;
        }
        else if(len1 < len2){
            return -1;
        }
        
            return 0;
    }
    
}

class AlphaeticalComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
      
            return s1.compareTo(s2);

    }
    
}

class ReverseAlphaeticalComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
      
            return -s1.compareTo(s2);

    }
    
}
public class Tutorial59_SortingLists {
    public static void main(String[] args) {
        
        //////////////Sorting Strings////////////////////
        List<String> animals=new ArrayList<>();
        
        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");
        
//        Collections.sort(animals,new StringLengthComparator());
//        Collections.sort(animals,new AlphaeticalComparator());
        Collections.sort(animals,new ReverseAlphaeticalComparator());
        
        for (String animal : animals) {
            System.out.println(animal);
        }


       //////////////Sorting Numbers////////////////////
        
        List<Integer> numbers=new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(1);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        
//        Collections.sort(numbers);
        Collections.sort(numbers,new Comparator<Integer>(){
            @Override
            public int compare(Integer num1, Integer num2) {
                    return -num1.compareTo(num2);
            }
            
        });
        
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        
        //////////////Sorting arbitrary objects////////////////////
        
        List<Person59> people=new ArrayList<Person59>();
        people.add(new Person59(1,"Joe"));
        people.add(new Person59(3,"Bob"));
        people.add(new Person59(4,"Claire"));
        people.add(new Person59(2,"Sue"));
        
//        Sort in order of ID
        Collections.sort(people,new Comparator<Person59>(){
            @Override
            public int compare(Person59 p1, Person59 p2) {
                if(p1.getId()> p2.getId()){
                    return 1;
                }
                else if(p1.getId()< p2.getId()){
                    return -1;
                }
                return 0;
            }
            
        });

        for (Person59 person59 : people) {
            System.out.println(person59);
        }
        System.out.println(" ");
        
        
        
//        Sort in order of NAME
        Collections.sort(people,new Comparator<Person59>(){
            @Override
            public int compare(Person59 p1, Person59 p2) {
                return p1.getName().compareTo(p2.getName());
            }
            
        });

        for (Person59 person59 : people) {
            System.out.println(person59);
        }
    }
}
