 import java.util.*;
 class Hash_Set1{ 
    public static void main(String[]args){ 
HashSet<Integer> s =new HashSet<>(100); 
s.add(2); 
s.add(4); 

s.add(6);   
s.add(2);  
s.add(6); 
s.add(3);    
s.remove(4); 
//s.clear();//clear all element  
System.out.println(s);  
System.out.println(s.isEmpty()); 
System.out.println(s.size()); 
if(s.contains(3)){
    System.out.print("present"); 
}
else {
    System.out.print("not present");}
 
s.remove(4);
                 

               

 
                 
            } 
        } 
        
    
