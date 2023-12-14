  //Deque implementation using LinkedList
   import java.util.Deque;
import java.util.LinkedList;

    /*in java Deque are allow 
    in a deque, we can insert and  
    remove elements from both front and rear.
     */ 
   
    public class CollDeque2 { 
       public static void main(String[] args) {
         // Array implementation of Deque
        Deque<Integer> dq = new LinkedList<>(); 
    //insert element      
       dq.offer(2); 
       dq.offer(4); 
       dq.offer(6);
       dq.offer(8); 
       System.out.println(dq);   
       //insert in front
       dq.offerFirst(10);  
       System.out.println(dq);
       //insert in rear 
       dq.offerLast(20); 
       System.out.println(dq); 
        
       //Access front
       int firstE = dq.peekFirst(); 
       //Access  rear 
       int lastE = dq.peekLast();  
        
       System.out.println("fist ele :"+firstE); 
       System.out.println("last ele :"+lastE); 
    
       //remove front 
       int DelF =dq.pollFirst(); 
       //remove rear 
       int DelR = dq.pollLast(); 
       System.out.println(dq); 
        
       System.out.println(DelF); 
       System.out.println(DelR); 
        
       //1 iterate  
       System.out.println("all Deque elememt is :");
       for(int i: dq){ 
           System.out.print(i +" ");
       } 
        System.out.println(); 
   
       dq.clear(); 
       System.out.println(dq);
         
       // exception cases
       //int peekF = dq.peekFirst();  
       int getF = dq.getFirst();
      // System.out.println(dq); 
       System.out.println(getF);
   
   
   
       }
       
   }
   
 
