 import java.util.*;
 public class StringPre_Suff {  
public static boolean isValidIPv4(String s) {  
		 
       char[]arr = s.toCharArray();
       int cnt=0; 
     int cnt2 =0;
 //  if(ipAddress.length()==0)return 0; 
   for(int i=0; i<s.length(); i= i+2){ 
       if(s.charAt(i) >='0' && s.charAt(i) <= '255'){ 
       cnt++;
       } 
      
   }  
   for(int i=1; i<s.length(); i=i+2){ 
    if(s.charAt(i)=='.'){ 
        cnt2++;
    }
   }
    
    if(cnt==4 && cnt2==3) 
    return true;

  return false; 
       // write your code here
   }
    public static void main(String[] args) { 
        String s ="1.1.1.250";  
        char[]arr = s.toCharArray();     
        // 123.111.12.k false
        // 122.0.330.0 false
        // 1.1.1.250 true
        // 1.0.0.0.1 false
        // boolean result = isValidIPv4(s); 
        //  System.out.println(result);  
   // System.out.println(s.length());  

   for(int i=0' i<arr.length; i++){ 

   }
         

}    
    
 }
