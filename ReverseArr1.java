 //print reverse arraylist
 import java.util.*;
public class ReverseArr1{ 
 public  static void getReverse(ArrayList7<Integer> arr, int size){ 
        System.out.println("reverse list is :");  
        for(int i=size-1; i>=0; i--){ 
            System.out.print(arr.get(i)+" ");
        }
    }
public static void main(String[]args){    
ArrayList7<Integer> arr = new ArrayList7<>();  
arr.add(1); 
arr.add(2); 
arr.add(3); 
arr.add(4); 

int size = arr.size();  
System.out.println("actual list is : ");  
System.out.println(arr);  


getReverse(arr,size); 

} 
}