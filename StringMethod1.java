public class StringMethod1{ 
    public static void main(String[] args) {
        // String str1= "deepesh"; 
        // String str2= "ahirwar";  
        // //string.concat(); 
        // //for merge two string 
        // System.out.println(str1.concat(str2)); 
        // System.out.println(str2.concat(str1)); 
       
        // //Using + Operator for Concatenation 
        // System.out.println(str1+str2); 
        // System.out.println(str2+str1); 
         

        String s1 =null; 
        String s2 ="java1"; 
        System.out.println(s1.concat(s2));  
        //error-"main" java.lang.NullPointerException: 
        // Cannot invoke "String.concat(String)" because "<local1>" is null 

       // System.out.println(s1 + s2); 
       //o/p->nulljava1

    }
}