public class Recursion5 {  
    static int powerN(int x, int n){ 
        if(n==0)return 1; 
         
        return x*powerN(x, n-1);   
    } 
    static int optimizePower( int a, int n){ 
         if(n==0) return 1; 

        int halfPower = optimizePower(a, n/2); 
        int halfPowersqr = halfPower*halfPower; 
        //if n is odd 
        if(n%2==1){ 
            return a*halfPowersqr; 
        } 
        return halfPowersqr;
    }
    public static void main(String[] args) { 
        System.out.println(powerN(2,2)); 
        System.out.println(optimizePower(2,3)); 
       
    }
    
}
