 import java.util.*;
 public class Strings1{  
     
    public static void  printLetters(String str){ 
        for(int i=0; i<str.length(); i++){ 
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String []args){ 
       /*  char arr[] = {'a','b','c','d'};  
        //String declaration
        String str = "abcd";  
        String str2 = new String("xyz"); 
         
        //String are IMMUTABLE 
         
        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine(); 
         
        System.out.println(name);
*/ 
 
  //String fullName = "deepesh Ahirwar";  
//System.out.println(fullName.length()); 
  
//concatenation
String firstName = "Deepesh"; 
String lastName = " Ahirwar";  
 
String fullName = firstName +" "+lastName;
 //System.out.println(fullName.charAt(0));
 printLetters(fullName);


    }
}