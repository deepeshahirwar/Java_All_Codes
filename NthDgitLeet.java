 import java.net.SocketTimeoutException;
import java.util.*;
 public class NthDgitLeet { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
      //StringBuffer  sb = new StringBuffer(); 
       String s =""; 
      for(int i=1; i<=n; i++){ 
        
        s += i;
      } 
     System.out.println(s);
  int ans = s.charAt(n-1); 
 
System.out.println(ans-48);

        
    }
    
}
