 import java.util.Arrays; 

 public class KthMaxElement{ 
    public static void main(String []args){ 
        int arr [] = {4,2,1,6,7,3,5}; 
        int n= arr.length; 
        int k=3;  

        Arrays.sort(arr);  
        //for  print sorted array  
        for(int i : arr){ 
            System.out.print(i+" ");  
        } 
        System.out.println(); 

        //for find KthMaxElement
      System.out.print(k+"th max element is  "+arr[(n-1)-(k-1)]);

    }
}