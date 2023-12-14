 import java.util.*;
 public class StringLeet { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next(); 
        String t =sc.next();  
         
        //first approach
    //    char ans =0;
    //   for(char i : s.toCharArray())
    //       ans ^= i;
    //     for(char j : t.toCharArray())
    //       ans ^= j;
       

 //second approach  

      int sum =0; 

      for(int i=0; i<t.length(); i++){  

          sum +=t.charAt(i);
      }   

       for(int i=0; i<s.length(); i++){  

          sum -= s.charAt(i);
      } 

    // return (char)sum;

      // return ans;
        
       // System.out.println(ans); 
System.out.println((char)sum);
    }
    
} 
// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
