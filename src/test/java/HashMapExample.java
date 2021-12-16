import java.util.HashMap;
import java.util.Map;

class Book {
    int id;
    String name,job;
    public Book(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;

    }
}
public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> hashmaplis=new HashMap<Integer,String>();
        hashmaplis.put(1,"Mango");
        hashmaplis.put(2,"Apple");
        hashmaplis.put(3,"Banana");
        hashmaplis.put(4,"Grapes");
        hashmaplis.put(2,"Apple");

        System.out.println(hashmaplis);
        for(Map.Entry m : hashmaplis.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(5,"Black berry");
        map.putAll(hashmaplis);
        System.out.println(map);

        //key-based removal
        map.remove(3);
        System.out.println("Updated list of elements: "+map);

        //key-value pair based removal
        map.remove(2, "Apple");
        System.out.println("Updated list of elements: "+map);

        //key based replace
        map.replace(4, "Apple");
        System.out.println("Updated list of elements: "+map);

        Map<Integer, Book> ml = new HashMap<Integer, Book>();
        Book b1=new Book(101,"Ram","SDET");
        Book b2=new Book(102,"Sham","inter");
        Book b3=new Book(103,"sid","ET");
        ml.put(1,b1);
        ml.put(2,b2);
        ml.put(3,b3);

        for(Map.Entry<Integer, Book> entry:ml.entrySet()){
            Book b=entry.getValue();
            System.out.println(b.id+" "+b.name+" "+b.job);
        }




    }

    }
