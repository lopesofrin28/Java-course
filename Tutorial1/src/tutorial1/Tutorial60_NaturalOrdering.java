
package tutorial1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



class Person60 implements Comparable<Person60>{
    private String name;

    public Person60(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person60{" + "name=" + name + '}';
    }  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.name);
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
        final Person60 other = (Person60) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person60 person60) {
//        return name.compareTo(person60.name);
        int len1=name.length();
        int len2=person60.name.length();
        
        if (len1>len2) {
            return 1;
        }
        else if (len1<len2) {
            return -1;
        }
        else{
            return name.compareTo(person60.name); 
        }
    }
    
    
}
public class Tutorial60_NaturalOrdering {
    public static void main(String[] args) {

        
        List<Person60> list=new ArrayList<Person60>();        
        SortedSet<Person60> set=new TreeSet<Person60>();
        
        addElements(list);
        addElements(set);
        
        Collections.sort(list);
        
        showElements(list);
        System.out.println();
        showElements(set);
        
    }
    private static void addElements(Collection<Person60> col){
        col.add(new Person60("Joe"));
        col.add(new Person60("Sue"));
        col.add(new Person60("Juliet"));
        col.add(new Person60("Claire"));
        col.add(new Person60("Mike"));
    }
    private static void showElements(Collection<Person60> col){
        for (Person60 element : col) {
            System.out.println(element);
        }
    }
}
