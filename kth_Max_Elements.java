import java.util.Comparator;
import java.util.PriorityQueue;  

 public class kth_Max_Elements {   

    static void Kth_Max_elements(int arr[] , int k){ 
        PriorityQueue<Integer> pq1 = new  PriorityQueue<>();//max pq 
        for(int i=0; i<arr.length; i++){   
        if(pq1.size() < k){  
          pq1.add(arr[i]);
  
        }  
        if(pq1.size() == k && arr[i] >= pq1.peek()){ 
          pq1.add(arr[i]);
        } 
        if(pq1.size() > k) pq1.remove(); 
  
      }
          //for printing desending order
          while(!pq1.isEmpty()){ 
            System.out.print(pq1.peek()+" "); 
            pq1.remove();
          } 
    } 
    // for kth min_elements  
    static void Kth_Min_elements(int arr[] , int k){ //Comparator.reverseOrder()
        PriorityQueue<Integer> pq = new  PriorityQueue<>(Comparator.reverseOrder());//max pq 
        for(int i=0; i<arr.length; i++){   
        if(pq.size() < k){  
          pq.add(arr[i]);
  
        }  
        if(pq.size() == k && arr[i] <= pq.peek()){ 
          pq.add(arr[i]);
        } 
        if(pq.size() > k) pq.remove(); 
  
      }
          //for printing desending order
          while(!pq.isEmpty()){ 
            System.out.print(pq.peek()+" "); 
            pq.remove();
          } 
    } 

      public static void main(String[] args) { //Comparator.reverseOrder()
        int arr[] ={62,3,4,9,1,6,12};
         int k =3; 

         Kth_Max_elements(arr, k);  
         System.out.println();
         Kth_Min_elements(arr,k);
       
       
  
      }
      
  }
  
    

