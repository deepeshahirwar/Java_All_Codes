 import java.util.Comparator;
import java.util.PriorityQueue;
 public class PQ1 { 
    public static void main(String[] args) {  
        //for min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();  
        //for max heap
      //  PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); 
         
        // pq.add(3);//O(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7); 
         
        // //for print pq elements 
        // while(!pq.isEmpty()){ 
        //     System.out.println(pq.peek());//O(1) 
        //     pq.remove();//O(logn)
        // } 
         
        //array sort in acsending order 
        int arr[] ={6,5,2,9,4,1}; 
        for(int i=0; i<arr.length; i++){ // O(n);
         pq.add(arr[i]);
        } 
        //print element in acsending order  
        System.out.println(pq);
        while(!pq.isEmpty()){ 
                System.out.print(pq.peek()+" ");//O(1) 
                pq.remove();//O(logn)
            }  
             
            //total tc for sort the arr in acsending order 
            // tc-> O(NlogN) 
            //sc -> O(n)
    }
    
}
