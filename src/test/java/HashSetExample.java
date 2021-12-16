import java.awt.*;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> hashintlis = new HashSet<Integer>();
        // add elements to HashSet object
        hashintlis.add(3);
        hashintlis.add(17);
        hashintlis.add(6);
        hashintlis.add(9);
        hashintlis.add(3);

        System.out.println(hashintlis);
        System.out.println(hashintlis.contains(9));
        hashintlis.remove("9");
        System.out.println(hashintlis);

        HashSet<String> hashstringlis=new HashSet();
        hashstringlis.add("One");
        hashstringlis.add("Two");
        hashstringlis.add("Three");
        hashstringlis.add("Four");
        hashstringlis.add("Five");

        System.out.println(hashstringlis);



    }
}
