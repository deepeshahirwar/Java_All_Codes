 import java.util.*; 
 import java.util.Collections;
 public class StringBuilder5 { 
    public static void main(String[] args) {
        //  StringBuilder sb = new StringBuilder();  
        //  sb.append("sajan");  
        String s = "sajan"; 
        String s1 = "asdf";

        char arr[] = s.toCharArray();  
        char arr1[] = s1.toCharArray(); 
        //sort in ascending order 
        Arrays.sort(arr); 
        System.out.println(Arrays.toString(arr)); 
         
        //sort in desending order  
        // Arrays.sort(arr1, Collections.reverseOrder()); 
         System.out.println(Arrays.toString(arr1));    
    }
    
}
