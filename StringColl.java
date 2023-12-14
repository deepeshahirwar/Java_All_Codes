public class StringColl{ 
public static void main(String []args){ 
   String str = "  Bhopal  ";   
  // String str1 = null; 
    /*Exception in thread "main" java.lang.NullPointerException:*/ 
     
   String str2 = "  i am boy  ";  
  /*  System.out.println(str.length());  
   System.out.println(str.indexOf('B')); 
   System.out.println(str.indexOf(" pal ")); 
   System.out.println(str.indexOf("pal")); 
   System.out.println(str.charAt(2));*/ 
    
    
   System.out.println(str.trim()); 
   //System.out.println(str1.trim()); 
   System.out.println(str2.trim()); 
     
   //use of trim() and lenght();  
   String  name ="    ";
   //if(name.length().trim()==0){error  
    if(name.trim().length() == 0){

    System.out.println("name is empty"); 
   } 
   else 
   { 
    System.out.println("valid name"); 
   } 
    // 
   System.out.println(name.trim().isEmpty()); 
 
    
   String s1 =" hello string "; 
   System.out.println(s1+"welcome"); 
   System.out.println(s1.trim()+"welcome");   

}
}