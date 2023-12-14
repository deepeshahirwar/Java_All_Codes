 import java.util.Arrays; 
 
 public class MinMax{ 
    public static void main(String args[]){ 
       /*  int a=20; 
         int b =10; 
         int maxi = Math.max(a,b);  
         int mini = Math.min(a,b);
          
         System.out.println("max num is : "+maxi); 
         System.out.println("min num is : "+mini);*/ 
          
         int arr[]={4,2,5,1,3}; 
         int size = arr.length;  
         System.out.println("\n original  array is : ");
         for(int i : arr){ 
            System.out.print(i+" ");
         }  

         Arrays.sort(arr); 
           
         System.out.println("\n soted array is : ");
         for(int i : arr){ 
            System.out.print(i+" ");
         }
    }
}