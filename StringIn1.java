 import java.util.*; 
 public class StringIn1 {   
    public static void main(String[] args) {
        
    
//     Scanner sc = new Scanner(System.in); 
//    // int n =sc.nextInt();  
//     String s = sc.nextLine();  
//     System.out.println(s); 
//     System.out.println(s.charAt(0)); 
      
//     for(int i =0; i< s.length(); i++){ 
//         System.out.print(s.charAt(i));
//     }
 
String s1 = "Deepesh";  
System.out.println("original string :"+s1); 
System.out.println(s1.toUpperCase());//DEEPESH 
System.out.println(s1.toLowerCase());//deepesh 

 String s2 = "  i am deepesh  ";  
 System.out.println(s2); 
 System.out.println(s2.length());
 //s2.trim();  

 System.out.println(s2.trim());
System.out.println(s2.length()); 
System.out.println(); 
 
//startsWith()
//endsWith() 
String s3 = "Sachin bhai"; 
System.out.println(s3.startsWith("Sa"));//true 
System.out.println(s3.endsWith("n"));//false
 
//intern() 
//for copy String   
System.out.println("s3 String : "+s3);
String s4 = s3.intern(); 
System.out.println("s4 String : "+s4); 
  
//copy
String s5 = s4; 
System.out.println(s5);

    }
    
}
