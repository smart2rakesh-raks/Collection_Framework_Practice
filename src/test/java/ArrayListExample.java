import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {

    //Add method
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arrintlist= new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++)
            arrintlist.add(i); //Adding object in arraylist
        System.out.println(arrintlist);

        for (int i = 0; i < arrintlist.size(); i++)
            System.out.print(arrintlist.get(i) + " ");

        // check if ArrayList contains element
        if (arrintlist.contains(3)) {
            System.out.println("3 was found in the list");
        } else {
            System.out.println("3 was not found in the list");
        }

        ArrayList<String> arrstinglist = new ArrayList<String>();
        arrstinglist.add("R"); //Adding object in arraylist
        arrstinglist.add("a");
        arrstinglist.add("k");
        arrstinglist.add("e");
        arrstinglist.add("s");
        arrstinglist.add("h");
        arrstinglist.add("k");

        System.out.println(arrstinglist);
        arrstinglist.remove(6); //Removing object in arraylist
        System.out.println(arrstinglist);

        //Traversing list
        for(String l:arrstinglist)
            System.out.println(l);


        if (arrstinglist.contains("e")) {
            System.out.println("e was found in the list");
        } else {
            System.out.println("e was not found in the list");
        }

        //accessing the element
        System.out.println("Returning element: "+arrstinglist.get(0));//it will return the 2nd element, because index starts from 0
        //changing the element
        arrstinglist.set(0,"r");
        //Traversing list
        for(String k:arrstinglist)
            System.out.println(k);

        // Cloning list
        ArrayList<String> clonestringlist = (ArrayList<String>)arrstinglist.clone();
        System.out.println(clonestringlist);
        ArrayList<Integer> cloneintlist = (ArrayList<Integer>)arrintlist.clone();
        System.out.println(cloneintlist);

        // Using Contains
        System.out.println(arrintlist.contains(3));
        System.out.println(arrstinglist.contains("s"));

        //Using indexof
        ArrayList<String> lis = new ArrayList<>(Arrays.asList("Ram", "Raks", "sham", "sid"));
        System.out.println(lis);

        int i= lis.lastIndexOf("sid");
        System.out.println(i);

        //Using retainall
        ArrayList<String> lis1 = new ArrayList<>(Arrays.asList("Ram", "Raks", "ham", "id"));

        // Before Applying method print both lists
        System.out.println("lis Contains :" + lis);
        System.out.println("lis1 Contains :" + lis1);

        lis1.retainAll(lis);

        // Displaying both the lists after operation
        System.out.println("lis Contains :" + lis);
        System.out.println("lis1 Contains :" + lis1);


    }
}
