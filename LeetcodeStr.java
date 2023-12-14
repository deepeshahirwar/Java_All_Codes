 import java.util.*;
 public class LeetcodeStr { 
    public static void main(String[] args) { 
        String num="51230100"; 
        char  arr[] =num.toCharArray(); 
        int size = num.length(); 
        for(int i=size-1; i>=0; i--){ 
            if(num.charAt(i) == 0  ){ 

    //     StringBuilder sb = new StringBuilder(); 
    //      sb.append(num); 
         
    //     int size = num.length(); 
         
    //     for(int i=size-1; i>=0; i--){ 
    //         if(num.charAt(i) == 0  ){  
    //             sb.delete(i,size+1);
    //         } 
    //         if(num.charAt(i) > 0){  
    //             break;
    //         }
    //     }
    //    String s = sb.toString();   
     
    //    System.out.println(s);
       // return s;
    }
    
}
