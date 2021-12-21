package CollectionsinJava;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample
{
	
	public static void String()
	{
	    List<String> programmingLanguages = new ArrayList<>();
	    
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);


        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });

           System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);

        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
	

	public static void intOperation()
	{ 
		  ArrayList<Float> set=new ArrayList<>();  
		           set.add((float) 1.1);  
		           set.add((float) 2.1);  
		           set.add((float) 3.2);  
		           set.add((float) 4.3);  
		           System.out.println("An initial list of elements: "+set);  
		         
		           set.remove(4.3);  
		           System.out.println("After invoking remove(object) method: "+set);  
		           ArrayList<Float> set1=new ArrayList<Float>();  
		           set1.add((float) 2.2);  
		           set1.add((float) 5.5);  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		            
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		 }  
	
	
	
		
	
    public static void main(String[] args)
    {
    	String();
    	intOperation();
    	
    }
    
}