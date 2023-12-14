import java.util.Queue; 
import java.util.LinkedList;
 public class CollQueue2 { 
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
         
        //add element 
        for(int i=0; i<5; i++) 
            q.add(i); 
             
            System.out.println("queue element is : "+q); 
             
            int  deleted =q.remove(); 
            System.out.println("removed element : "+deleted); 
            System.out.println(q); 
             
            //to view head of the queue 
            int head = q.peek(); 
            System.out.println("head of queue : "+head ); 
             
            int size = q.size(); 
            System.out.println("size of queue:"+size); 
              
            //contains method return true or false
            System.out.println(q.contains(2)); 
             
            //print queue all element 
            for(int i : q){ 
                System.out.println(i+" ");
            } 
            
    }
    
}
