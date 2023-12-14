  // program for (type casting) in java
  import java.util.*;
 public class  Java2{ 
    public static void main(String []args){ 
        Scanner sc = new Scanner(System.in); 
        
        char num1 = 'a';  
         int num2 = (int)num1; 
 
         char num3 ='b'; 
         int num4 = (int)num3;
        System.out.println( num2);  
 
        System.out.println( num4);  
         
        char a='a'; 
        char b='b';  
        System.out.println( (int)a); 
        System.out.println( (int)b);  
        System.out.println( b-a);  

 short s= 19; 
 char ch = 'a'; 
 byte bt =  32; 
  
 byte bt1 = (byte)( s + ch + bt);
 System.out.println( bt1);  


    }
}






