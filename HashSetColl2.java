 import java.util.HashSet; 
 import java.util.*;

 public class HashSetColl2 {
     
    public static void main(String[] args) { 
        HashSet<Integer> set = new HashSet<>(); 
        set.add(1); 
        set.add(2);
        set.add(3); 
        set.add(4);
        set.add(5);  

//iteration in Hashset 

        Iterator it = set.iterator(); 
        while(it.hasNext()){ 
         System.out.println(it.next());
        }  
        System.out.println();
         
        for(int i: set){ 
            System.out.println(i);
        }
         
        
    }
}
