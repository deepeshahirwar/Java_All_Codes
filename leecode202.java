 public class leecode202{
    public static boolean happyNumber(int n) {  
        //base case 
        if(n==1){ 
            return true;
        } 
        if(n >1 && n<=4){ 
            return false;
        }  
        
        int digit =0; 
        int num=0; 
         
    
        while(n>0){  
            digit = n % 10;  
            
             num += digit*digit;
             n /=10;
          
        }
        return happyNumber(num);
    } 
    public static void main(String[] args) { 
        int n=2;
       System.out.println( happyNumber(n)); 
    }
}