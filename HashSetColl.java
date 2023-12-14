  /*HashSet store always unique element in unoder manner */
  import java.util.HashSet;  
 import java.util.Collections;
 
 public class HashSetColl {  
    public static void main(String[] args) { 
     //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
    set.add("One"); 
    set.add("One");    
    set.add("Two");    
    set.add("Three");   
    set.add("Four");  
    set.add("Five"); 

   System.out.println(set); 
   //contains() 
   if(set.contains("One")){ 
    System.out.println("One is present :");
   } 
   else{ 
    System.out.println("One not present :");
   } 
    
   if(set.contains("six")){ 
    System.out.println("six is present :");
   } 
   else{ 
    System.out.println("six is not present:");
   } 
   //remove() 
   set.remove("One"); 

   if(set.contains("One")) 
    System.out.println("One is present :");
    else 
    System.out.println("One not present :"); 
     
    System.out.println("set isze is :"+set.size()); 
     
    set.clear(); 
    System.out.println(set); 
    System.out.println(set.isEmpty());

    

    }

    
}
