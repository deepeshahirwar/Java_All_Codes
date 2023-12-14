 import java.util.*;
 public class Union_Intesec {  
    //for union of two array 
  static void union(int arr1[],int arr2[]){ 
    HashSet<Integer> set1 = new HashSet<>(); 
     for(int i : arr1){ 
        set1.add(i);
     } 
     for(int j : arr2){ 
        set1.add(j);
     } 
     System.out.println(set1);

    } 
    //for intersection of two arrays 
    static void intersection(int arr1[],int arr2[]){ 
        HashSet<Integer> set2 = new HashSet<>(); 
         for(int i = 0; i<arr1.length; i++){ 
            set2.add(arr1[i]);
         }  
          
         int cnt =0;
         for(int i = 0; i<arr2.length; i++){ 
           if(set2.contains(arr2[i])){  
            cnt++;
            set2.remove(arr2[i]); 
            
           } 
         }  
         System.out.println("intersection is :"+cnt);
         System.out.println(set2); 
        
    
        } 
    public static void main(String[] args) { 

        int arr1[]={7,3,9}; 
        int arr2[]={6,3,9,2,9,4}; 
        union(arr1,arr2);
        intersection(arr1,arr2);  

    }
    
}
