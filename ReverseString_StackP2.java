 import java.util.*;
 public class ReverseString_StackP2 {  
    static String reverseString(String str){ 
        Stack<Character> s = new Stack<>(); 
         //for push in the stack
        int idx=0; 
        while( idx < str.length()){ 
            s.push(str.charAt(idx)); 
            idx++;
        } 
          
        //for append stack oof top into sb and pop()
        StringBuilder sb = new StringBuilder(""); 
        while(!s.isEmpty()){ 
            char curr = s.pop(); 
            sb.append(curr);
        } 
 
        return sb.toString();
    }
    public static void main(String[] args) {  
         
        String str ="deepesh"; 
     String ans =   reverseString(str); 
     System.out.println(ans);

        
    }
    
}
