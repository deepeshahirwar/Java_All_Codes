
 //StringBuffer methods 
 public class StringBuffer2 { 
 public static void main(String[] args) { 
        //creation of empty StringBuffer  
 StringBuffer sb = new StringBuffer(); 


System.out.println(sb.capacity()); 
String s1 =null;  
sb.append(s1);  

//sb.append(null); error
System.out.println(sb); 
System.out.println("length of sb :"+sb.length()); 
System.out.println("present capacity of sb :"+sb.capacity());  
 
//insert(int pos, str); 
sb.insert(1,"a"); 
System.out.println(sb); 
  
// replace(int s, int e, int str)
sb.replace(1,3,"www"); 
System.out.println(sb); 
 
//delete(int s, int e)
sb.delete(1,4); 
System.out.println(sb);


        
    }
    
}
