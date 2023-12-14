 import java.util.*; 
 //queue implement using priorityqueue
 public class CollQueue3 {  
    public static void main(String[] args) {
     Queue<Integer> pq = new PriorityQueue<>(); 
      
     pq.add(10);  
     pq.add(5); 
     pq.add(1); 
     pq.add(7);  
     pq.add(9);  
       
     System.out.println(pq);
     /* in the pq peek element and  frront element are same */
     int peekele = pq.peek();   
     int front =pq.remove(); 
      
     System.out.println("front element "+front); 
     System.out.println("peek element : "+peekele);
     
      
     System.out.println("pq front : "+front); 
     System.out.println(pq); 
     System.out.println("peek element :"+pq.peek());
 
     Queue<String> pq1 = new PriorityQueue<>();  
      
     pq1.add("b"); 
     pq1.add("d"); 
     pq1.add("a"); 
     pq1.add("c"); 
      
     System.out.println(pq1); 
    String front1 = pq1.remove();  
    System.out.println("pq1 front : "+front1);  
    System.out.println(pq1);
    System.out.println("peek element :"+pq1.peek()); 
     
    


    }
}
