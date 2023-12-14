 import java.util.*;
 public class  RomanToInt{ 
    public static void main(String []args){  
      Scanner sc = new Scanner(System.in); 
      String s = sc.next(); 
       
      String ans = "";
        for(int i=0; i<s.length(); i++){  
            //case1
            if(s.equals(i) =='I' && s.equals(i+1)=='V') 
            ans +=4; 
            else if(s[i]=='I' && s[i+1]=='X') 
            ans +=9;  
            //case2
            else if(s[i]=='X' && s[i+1]=='L') 
            ans +=40;  
            else if(s[i]=='X' && s[i+1]=='C') 
            ans +=90;  
            //case3 
            else if(s[i]=='C' && s[i+1]=='D') 
            ans +=400; 
            else if(s[i]=='C' && s[i+1]=='M') 
            ans +=900;   
             
            //basic cases 
            else if(s[i]=='I') 
            ans +=1;  
            else if(s[i]=='V') 
            ans +=5; 
            else if(s[i]=='X') 
            ans +=10; 
            else if(s[i]=='L') 
            ans +=50;  
            else if(s[i]=='C') 
            ans +=100; 
            else if(s[i]=='D') 
            ans +=500; 
            else if(s[i]=='M') 
            ans +=1000;  
             
            System.out.println(ans);
        }
    }
}