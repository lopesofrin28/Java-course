//HASHCODE AND EQUALS ARE IMPORTANT IN CUSTOM OBJECTS FOR CHECKING IF OBJECTS ARE EQUAL
package tutorial1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


class Person58{
    private int id;
    private String name;

    public Person58(int id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "{ID is:"+id + "; Name is:"+ name+"}" ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.name);
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
        final Person58 other = (Person58) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
public class Tutorial58_CustomObjects {
    public static void main(String[] args) {
        
        Person58 p1=new Person58(0, "Bob");
        Person58 p2=new Person58(1, "Sue");
        Person58 p3=new Person58(2, "Mike");
        Person58 p4=new Person58(1, "Sue");
        
        
        Map<Person58,Integer> map=new LinkedHashMap<Person58,Integer>();
        
        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,1);
        
        for (Person58 key : map.keySet()) {
            System.out.println(key +": "+map.get(key));
        }
        
        Set<Person58> set=new LinkedHashSet<Person58>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        
        System.out.println(set);
    }
}
