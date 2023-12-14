import java.util.*;
public class checkPalindrome { 
    public static void main(String[] args) { 
     StringBuilder sb = new StringBuilder("11011");    
     StringBuilder sb1 = new StringBuilder();  
     //for copy 
     sb1.append(sb); 
      
     sb.reverse(); 
     if(sb1.compareTo(sb)== 0) 
     System.out.println("isPelindrome:"); 
     else 
     System.out.println("notPelindrome:");
      

     // String s1 = "tit"; 
     // s1.reverse(); 
   // System.out.println(s1);  
    // int size = s1.length(); 
 
    // int cnt =0;
    // for(int i=0; i<size; i++){ 
    // if(s1.charAt(i) == s1.charAt(size-i-1)){ 
    //  cnt++;  
    //  }    
    // }  
    // if(cnt == size) 
    // System.out.println( "s1 is palindrome" ); 
    // else 
    // System.out.println("s1 is not palindrome :");
        
    }
    
}
