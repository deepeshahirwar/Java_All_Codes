 import java.util.*;
  public class ReverseStr{ 
    public static void main(String[]arg){ 
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();  
        while(t-->0){ 
        int n = sc.nextInt();  

        String s =sc.next(); 
        int len=s.length(); 
        String rev=""; 
        for(int i=len-1;i>=0;i--){  
            rev=rev+s.charAt(i);
        }  
        if(s.equals(rev)){
        System.out.println("YES");  
        }
        else {
        System.out.println("NO");
        }  

    }
    }
}