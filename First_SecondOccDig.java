 import java.util.*;
 public class First_SecondOccDig {  
    public static int first_SecondOccDig(String str){  
        HashSet<Integer> set = new HashSet<>(); 

        for (int i=0; i<str.length(); i++)
        {
            int c = str.charAt(i);
            // If element is already in hash set, update x
            // and then break
            if (set.contains(c))
                return c;
            else // Else add element to hash set
                set.add(c);
        }
 
        return -1; 
    }
    public static void main(String[] args) { 
        String str ="87692";
        int ans1 = first_SecondOccDig(str); 
       // System.out.println(ans1-48); 
        if(ans1>0) 
        System.out.println(ans1-48); 
        else 
        System.out.println(ans1);
    }
    
}
