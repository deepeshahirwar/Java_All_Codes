  // implement Queue interface using the LinkedList
  import java.util.Queue; 
 import java.util.LinkedList;
 public class CollLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        // add elemets
         q.offer(1); 
         q.offer(2); 
         q.offer(3); 
         q.offer(4); 
          
         System.out.println(q); 
        int del =    q.poll(); 

         System.out.println(del);
         System.out.println(q); 
          
         int peek = q.peek(); 
         System.out.println(peek); 
          
     int size =    q.size(); 
     System.out.println("queue size is :"+size); 
      
    
    }
}
