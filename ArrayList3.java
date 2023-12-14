import java.util.ArrayList; 
  
public class ArrayList3{
public static void main(String[]args){ 
    //creating a arraylist 
ArrayList<Integer> arr = new ArrayList<>(); 
// ArrayList<String> arr = new ArrayList<>(); 
// ArrayList<Boolean> arr = new ArrayList<>(); 
  
//for insesting 
arr.add(1); // O(1)
arr.add(2); 
arr.add(3);
arr.add(4);
arr.add(5);  
 
arr.add(3,100);
//get operation -O(1) 
int element = arr.get(1); 
System.out.println(element);
 
//for  all deleting 
//arr.clear(); 
//for deleting index of value 
//arr.remove(0); 
 
//for set value at index
 arr.set(3,10); 
 arr.set(2,20);  
 
  
 //for element present or not  
 System.out.println(arr.contains(10)); 
 System.out.println(arr.contains(30)); 
 

System.out.println(arr);

} 
}