public class StringsMethod {  
    public static void main(String[] args) {
        
    
    String s1 = "Deepesh"; 
    String s2 = "deepesh"; 
    // equals  
    System.out.println(s1.equals(s2));//false 
     
    String s3 ="java is platform independent java is secure"; 
    //replace()  
    /*The String class replace() method replaces  
    all occurrence of first sequence of character with  
    second sequence of character. */
    String s4 = s3.replace("java","c++"); 
    System.out.println(s4); 
     
//valueOf() 
/*valueOf method convert given type such as int, 
 * float, long,duobble ,sort ,char into String
 */ 
int a = 10; 
String s5 = String.valueOf(a); 
System.out.println(s5+10);
    
    }   
}
