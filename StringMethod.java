 public class StringMethod{ 
    public static void main(String[] args) {
        String str1= "  i am deepesh  ";  
        //trim() it is remove the leading and trailing whitespaces
         System.out.println(str1.trim()); 
          
         String str2= "    i am deepesh  ";  
         System.out.println(str2.length());
         //replaceAll(" ","");  
    String result =  str2.replaceAll(" ","");  
         System.out.println(result); 
         System.out.println(result.length()); 
          
         //no of spaces in str2 
         int totalSpace = str2.length()-result.length(); 
        System.out.println("num. of space in str2 : "+totalSpace);
    }
}