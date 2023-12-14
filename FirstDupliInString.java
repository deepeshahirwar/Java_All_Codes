 import java.util.*; 
 import java.util.HashSet;
 public class FirstDupliInString { 
    public static void main(String[] args) {
        String s ="876982972";  
        char arr[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();  

        char ans =' '; 
        for(char i=0; i<s.length(); i++){ 
           if(set.contains(s.charAt(i))){ 
              ans = s.charAt(i); 
              break;
           } 
           else{ 
            set.add(s.charAt(i));
           }
        } 
        

System.out.println(s);
System.out.println("first duplicate element is  -> "+ans);
    }
    
}
