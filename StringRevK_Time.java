public class StringRevK_Time { 
    public static void main(String[] args) {
         //reverse from 0 to k  
         String s="abcd"; 
         int k =2;
      int n =s.length();  
      String ans ="";
       
       for(int i=k-1; i>=0; i--){ 
       ans=ans+s.charAt(i);
       }  
        for(int i=k; i<n; i++){ 
       ans=ans+s.charAt(i);
       } 
     // return ans; 
     System.out.println(ans);
        
    }
    
}
