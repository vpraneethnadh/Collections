import java.util.*;

public class HashSetExample{
    public static void main(String args[]){
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("Hello");
        hs.add(10.6);
        hs.add(false);
        hs.add(null);
        System.out.println(hs);

        hs.remove(null);
        System.out.println(hs);

        System.out.println(hs.contains("Hello"));

        System.out.println(hs.contains(90));

        System.out.println(hs.isEmpty());

        hs.clear();
        System.out.println(hs);
    }
}