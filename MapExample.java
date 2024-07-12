import java.util.*;

public class MapExample {
    public static void main(String args[]){
        HashMap <Integer,Character> m = new HashMap<Integer,Character>();
        m.put(101,'A');
        m.put(102,'B');
        m.put(103,'C');
        m.put(104,'D');
        m.put(105,'E');
        m.put(106,'F');
        m.put(107,'G');
        m.put(108,'H');

        System.out.println(m);

        System.out.println(m.get(102));

        m.remove(108);
        System.out.println(m);

        m.remove(106,'F');
        System.out.println(m);

        System.out.println(m.containsKey(104));
        System.out.println(m.containsKey(109));

        System.out.println(m.containsValue('D'));
        System.out.println(m.containsValue('X'));

        System.out.println(m.keySet());

        System.out.println(m.values());

        System.out.println(m.entrySet());

        System.out.println(m.size());

        System.out.println(m.isEmpty());

        System.out.println(m.isEmpty());

        for(Map.Entry entry : m.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        m.clear();
        System.out.println(m);
    }    
}
