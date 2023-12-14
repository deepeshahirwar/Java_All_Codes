import java.util.*;  
 

 class Codeforces { 
   public static void main(String args[]){   
    Scanner sc = new Scanner(System.in); 
  int t =sc.nextInt(); 
     while(t-->0){ 
     String s =sc.next();
     
     String s2 = s.toLowerCase();
 

      if(s2.equals("yes")) {
         System.out.println("yes");
      }
     
      else {
         System.out.println("no");  
       }
    }
     
     
} 
}