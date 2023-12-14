import java.util.* ;
import java.io.*; 
import java.util.ArrayList; 
import java.util.HashSet;
 public class Gaurav { 
  
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {  
         int dummy[] = new int[2]; 
         //for missing element
        
        int ans = (n*(n+1))/2; 
         
         int sum =0; 
         for(int i=0; i<n; i++){ 
             sum +=arr.get(i);
         } 
         int missing = ans -sum; 
         dummy[0]=missing; 
          
//for repeating element; 
HashSet<Integer> set = new HashSet<>(); 
int  dupli=0; 

 for(int num : arr){ 
     if(set.contains(num)){ 
         dupli = num; 
         break;
     } 
     else{ 
         set.add(num);
     }
 }  
 dummy[1]=dupli; 
 
  
  return dummy;
        // Write your code here
    }

public static void main(String []arg)
{ 
    ArrayList<Integer> arr = new ArrayList<>(); 
int n = arr.size(); 
arr.add(1); 
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(4);
arr.add(6);
  

System.out.println(missingAndRepeating(arr,n));

        
        
    }
}

