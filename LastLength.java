
import java.util.*;

public class LastLength {  
     
    public static void main(String[] args) {
    int n =100; 
    int n1=n*2; 
    int n2=n*3;  
      
    StringBuilder sb = new   StringBuilder(); 
    sb.append(n); 
    sb.append(n1);
    sb.append(n2); 

String s2 =sb.toString();
System.out.println(sb); 
System.out.println(s2); 
 
 
String temp ="";
for(int i=1; i<=9; i++){
  temp +=i;
} 
System.out.println(temp);  

// for(int i=0; i<sb.length(); i++){
//   if(sb.charAt(i)=='0'){
//     //return false; 
//     System.out.println("false");
//   }
// }
//  boolean flag = true; 
//  //for comaparision     
//       for(int i=0; i<temp.length(); i++){
//         if(!s2.contains(temp.charAt(i))||s2.charAt(i)=='0' ){
//         flag = false;
//         }
//       } 
   HashSet<Character> set = new HashSet<>(); 
   for(int i=0; i<s2.length(); i++){
    set.add(s2.charAt(i));
   } 
   char ch ='0';    
   if(set.contains(ch) || set.size() < 9){
    System.out.println("false");
   } 

    
System.out.println("true");
    
    }
    
}
