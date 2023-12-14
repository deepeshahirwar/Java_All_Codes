import java.net.SocketTimeoutException;

public class StringBuilder4 { 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); 
        String s1 = null;  
        s1 = "abc"; 
        //append()
        sb.append(s1);  

        System.out.println(sb); 
      // insert(); 
      sb.insert(1,"java"); 
      System.out.println(sb);   
       
    int ans =  sb.indexOf("a");//0  
    System.out.println(ans);
 
    //replace() 
    sb.replace(1,3, "c++"); 
    System.out.println(sb); 
     
    //delete 
    int  size = sb.length();  
    sb.delete(0, size);   

    System.out.println("empty sb " + sb); 

    sb.append("newString");  
     
   System.out.println("befor reverse : "+ sb);
    sb.reverse(); 
    System.out.println("after reverse : "+ sb);
     
   

    }
    
}
