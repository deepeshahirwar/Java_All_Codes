import java.util.ArrayList; 
import java.util.List; 
import java.util.Collections;
 public class CollArralist2 { 
 
       public static void main(String[] args) {
           
           List<Integer> list = new ArrayList<>(); 
        
           list.add(5);  
           list.add(10);  
           list.add(15); 
           list.add(20);  
            
           System.out.println(list);  
           int size = list.size(); 
             
           //for update value
           list.set(1,11); 
           System.out.println(list); 
            
           list.remove(1); 
           System.out.println(list+" list size is: "+size); 
           list.remove(Integer.valueOf(20)); 
            
           System.out.println(list);
            
           //list.clear(); 
            
           //Iterator method 
           

            
          
   
   
       }  
   }
    
   
    

