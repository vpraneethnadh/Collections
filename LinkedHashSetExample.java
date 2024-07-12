import java.util.*;

public class LinkedHashSetExample {
    public static void main(String args[]){
        LinkedHashSet lset = new LinkedHashSet();
        lset.add("A");
        lset.add(40);
        lset.add("Hello");
        lset.add(true);
        lset.add(null);
        
        System.out.println(lset);

        lset.remove(40);
        System.out.println(lset);

        System.out.println(lset.contains("Hello"));

        System.out.println(lset.contains(90));

        System.out.println(lset.isEmpty());

        lset.clear();
        System.out.println(lset);
    }
}
