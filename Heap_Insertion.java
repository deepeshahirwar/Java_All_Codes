 import java.util.*; 
 //find kth max element in array
 public class Heap_Insertion { 
    public static void main(String[] args) { 
         int arr[] ={7,2,5,3,9,6}; 
         int k=3; 
         int n = arr.length; 

// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
 PriorityQueue<Integer> pq = new PriorityQueue<>();  
for(int i=0; i<n; i++){
   // pq.add(arr[i]); 
     
    if(pq.size() < k){
      pq.add(arr[i]);  
    } 
    if(arr[i] > pq.peek() && pq.size() == k){
      pq.add(arr[i]);   
    } 
     if(pq.size() > k){
      pq.remove();  
    } 
}
  
//for pq elemet printing 

// System.out.println(pq); 
// while(!pq.isEmpty()){
//     int top = pq.peek(); 
//     System.out.print(top+" ");  
//     pq.remove();

// } 
 System.out.println(pq.peek());
 
    }
    
}
