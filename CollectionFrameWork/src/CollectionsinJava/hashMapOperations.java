package CollectionsinJava;

import java.util.*;

public class hashMapOperations {

public static void integerString()
  {
  
    HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
    
    hashMap.put(1, "One");
    hashMap.put(2, "Two");
    hashMap.put(3, "Three");
    hashMap.put(4, "Four");
   
    for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
      System.out.println(entry.getKey()+" : "+entry.getValue());
    }
    
    hashMap.replace(1, "One-1");
    System.out.println(hashMap);
    hashMap.replace(1, "One-1", "First");
    System.out.println(hashMap);
    hashMap.remove(4);
    System.out.println(hashMap);
  }

public static void doubleString()
{

  HashMap<String,String> hashMap1 = new HashMap<String,String>();
  
  hashMap1.put("Santosh", "One");
  hashMap1.put("Vinoth", "Two");
  hashMap1.put("Preetham", "Three");
  hashMap1.put("Rakesh", "Four");
 
  for(Map.Entry<String, String> entry : hashMap1.entrySet()) {
    System.out.println(entry.getKey()+" : "+entry.getValue());
  }
  
  hashMap1.replace("Santosh Kumar", "one");
  System.out.println(hashMap1);
  hashMap1.replace("Santosh Kumar" , "Santosh Kumar Mahadevan");
  System.out.println(hashMap1);
  hashMap1.remove("Rakesh");
  System.out.println(hashMap1);
}

public static void stringFloat()
{

  HashMap<String,Float> hashMap2 = new HashMap<String,Float>();
  
  hashMap2.put("pie", (float) 3.15);

 
  for(Map.Entry<String, Float> entry : hashMap2.entrySet()) {
    System.out.println(entry.getKey()+" : "+entry.getValue());
  }
  
  hashMap2.replace("Pie", (float) 3.14);
  System.out.println(hashMap2);

}


    public static void main(String args[])

    {
    	integerString();
    	doubleString();
    	stringFloat();
    	
    }
  }
