public class maximumSwap { 
    public static void main(String[] args) {
        int n =99835;  
        StringBuffer sb = new StringBuffer(); 
         sb.append(n); 
          
        int max =Integer.MIN_VALUE;
     for(int i=0; i<sb.length(); i++){  
        if(sb.charAt(i) > max) 
        max = sb.charAt(i);

     } 
     int mx = max-48;
     // System.out.println(max-48);  
     // System.out.println(sb);
    }
    
}
