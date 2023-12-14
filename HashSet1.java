 // basic of hashset 
 import java.util.*; 

public  class HashSet1{ 
 
public static void main(String[]args){    
HashSet<Integer> set = new HashSet<>();  
set.add(4); 
set.add(2); 
set.add(3); 
set.add(1);  
set.add(10);  
set.add(5);  
 
set.remove(10); 
//cheak 3 is presentor not 
//
 System.out.println(set.contains(3)); 
 //methods 
 //set.size(); 
 System.out.println(set.size()); 
 //set.isEmpty(); 
System.out.println(set.isEmpty()); 
 //set.clear();
 
 System.out.println(set); 
  
 set.clear();

} 
}