  import java.util.Comparator;
  import java.util.PriorityQueue; 

 public class PQ2 { 
    public static void main(String[] args) {
      PriorityQueue<Integer> pq = new  PriorityQueue<>(); //min pq
      PriorityQueue<Integer> pq1 = new  PriorityQueue<>(Comparator.reverseOrder());//max pq 
       
      pq.add(4); 
      pq.add(7);
      pq.add(2);
      pq.add(9); 
      // for printing acsending order 
      while(!pq.isEmpty()){ 
        System.out.print(pq.peek()+" "); 
        pq.remove();
      }
   
      System.out.println();
      //for pq1 
      pq1.add(4); 
      pq1.add(7);
      pq1.add(2);
      pq1.add(9);  
      //for printing desending order
      while(!pq1.isEmpty()){ 
        System.out.print(pq1.peek()+" "); 
        pq1.remove();
      }
     

    }
    
}
