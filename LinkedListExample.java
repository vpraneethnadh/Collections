import java.util.*;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add("Hi");
        list.add('A');
        list.add(30.5f);
        list.add(true);
        list.add(40);
        list.add(null);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.addFirst(5);
        System.out.println(list);

        list.set(2,"HI");
        System.out.println(list);

        list.addLast("Hello");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        list.clear();
        System.out.println(list);
    }
}
