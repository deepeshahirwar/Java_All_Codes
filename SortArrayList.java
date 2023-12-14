 //print maximum element 
 import java.util.Collections; 
 import java.util.ArrayList; 

public  class SortArrayList{ 
 
 
public static void main(String[]args){    
ArrayList<Integer> arr = new ArrayList<>();  
arr.add(4); 
arr.add(2); 
arr.add(3); 
arr.add(1);  
arr.add(10);  
arr.add(5);  


 
 System.out.println("before sorting : "+arr); 
 Collections.sort(arr);
 
 System.out.println("after sorting : "+arr); 

} 
}