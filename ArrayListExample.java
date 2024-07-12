import java.util.*;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add("Hi");
        ar.add('A');
        ar.add(1.5);
        ar.add(true);
        System.out.println(ar);

        ar.add(4,10);
        System.out.println(ar);

        ar.remove(true);
        System.out.println(ar);

        ar.remove(3);
        System.out.println(ar);

        System.out.println(ar.get(3));
        
        ar.set(1,"Hello");
        System.out.println(ar);

        System.out.println(ar.contains(10));

        System.out.println(ar.contains("Hi"));

        System.out.println(ar.isEmpty());

        Collections.shuffle(ar);
        System.out.println(ar);

        ArrayList ar2 = new ArrayList<>();
        ar2.add(10);
        ar2.add(20);
        ar2.add(50);
        ar2.add(30);
        ar2.add(40);
        ar2.add(70);
        ar2.add(60);
        System.out.println(ar2);
        
        Collections.sort(ar2);
        System.out.println(ar2);
        
        Collections.sort(ar2,Collections.reverseOrder());
        System.out.println(ar2);

        Collections.shuffle(ar2);
        System.out.println(ar2);

        String[] arr = new String[5];
        arr[0] = "ABC";
        arr[1] = "DEF";
        arr[2] = "GHI";
        arr[3] = "JKL";
        arr[4] = "MNO";

        for(int i = 0;i < 5;i ++)
            System.out.println(arr[i]);
        
        ArrayList ar3 = new ArrayList(Arrays.asList(arr));
        System.out.println(ar3);

        ar3.clear();
        System.out.println(ar3);
    }
}
