  // implimentation LinkedHashSet 
/*LinkedHashSet maintain  the order of element */
import java.util.*;
 public class LinkedHS { 
    public static void main(String[] args) {
 LinkedHashSet<String> cities = new LinkedHashSet<>();   

        cities.add("bhopal");  
        cities.add("indor");  
        cities.add("jabalpur");  
        cities.add("dewash");   
         
        System.out.println(cities); 
        cities.add("bengaluru"); 
        System.out.println(cities);  

         cities.remove("bhopal"); 
         System.out.println(cities); 
          
         System.out.println("size is :"+cities.size()); 
          
         if(cities.contains("indor")) 
         System.out.println("yes"); 
         else
         System.out.println("no"); 
          
         cities.clear(); 
         //isEmpty() 
        System.out.println(cities.isEmpty());
    


    }
    
}
