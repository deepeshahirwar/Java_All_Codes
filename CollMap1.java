 import java.util.*;
 public class CollMap1 { 
    public static void main(String[] args) { 
 Map<String,Integer> map = new HashMap<String, Integer>(); 
// maping of key and value  
 map.put("amit",100); 
 map.put("deepesh",101); 
 map.put("rahul",102);   
 map.put("rahul",103);  
  
 System.out.println(map); 
  
 //Elements can traverse in any order   
  for(Map.Entry m : map.entrySet()){ 
    System.out.println(m.getKey()+" "+m.getValue());
  } 
   
  // 
  System.out.println(map.keySet()); 
  System.out.println(map.values()); 
   
  for(String key : map.keySet()){ 
    System.out.println(key + " "+ map.get(key));
  }

    }
    
}
