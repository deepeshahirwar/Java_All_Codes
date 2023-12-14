import java.util.Queue; 
import java.util.LinkedList;
 public class CollQueue { 
      
  
  /*queue follow the FIFO property (first in fist out) */
      public static void main(String[] args) {
          

      Queue<String> animals = new LinkedList<>(); 
      animals.add("lion"); 
      animals.add("dog"); 
      animals.add("horse"); 
      animals.add("cat");  
       
      System.out.println("queue :"+ animals); 
       
       String front = animals.remove(); 
     System.out.println("after remove :"+animals);  
     System.out.println("removed element : "+front);
     // add element
     animals.add("elephent"); 
      
     System.out.println(animals); 
      
     String peeked = animals.peek(); 
     System.out.println("peeked element : "+peeked);
       
     

      }  
  }
  
    

