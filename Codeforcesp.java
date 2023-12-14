 import java.util.*;
 public class Codeforcesp { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int t=sc.nextInt();  
        while(t-->0){
        String s=sc.next();  
        char[] ch = s.toCharArray(); 
        int a = ch[0]; 
        int b = ch[2];
         
       
        System.out.println((a+b)-96); 
        } 
       
    }
    
}
