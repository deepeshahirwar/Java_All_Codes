 //StringBuffer constructors 


public class StringBuffer1 { 
    public static void main(String[] args) { 
        //creation of empty StringBuffer  
 StringBuffer sb = new StringBuffer();  
StringBuffer sb1 = new StringBuffer("deepesh"); 
StringBuffer sb2 = new StringBuffer(5);  
System.out.println(sb.capacity()); 

//methoss of sb 
for(int i=1; i<=27; i++){ 
    sb.append(i);
} 
System.out.println(sb); 
System.out.println(sb.capacity()); 

        
    }
    
}
