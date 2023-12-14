 //methods of StringBuffer
 public class StringBuffer3 { 
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); 
         
        sb.append("seetaram");  
        char s1 = sb.charAt(3);  

        System.out.println(s1);  
         
        System.out.println("initial sb "+sb);
        //reverse()
        sb.reverse(); 
        System.out.println("reverse sb :"+sb); 
         
        //substring(int s)
 
        String ss =sb.substring(2); 
        System.out.println(ss); 
//substring(int s, int e) 
 
String ss2 = sb.substring(0,4); 
System.out.println(ss2);

    }
    
}
