 import java.util.Scanner;
 public class PowerOfThree {   

        public boolean isPowerOfThree(int n) { 
            if (n % 3 != 0){ 
                return false;
            }  
            int cnt =0;
            if(n % 3 == 0){ 
                while(n != 1){ 
                    n = n/3; 
                    cnt++;
                }
            } 
            if(Math.pow(3,cnt)==n){ 
                return true;
            } 
            else  
            { 
           return false;
            }
             
             
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         int n =sc.nextInt(); 
          
         PowerOfThree obj = new PowerOfThree(); 
        boolean ans = obj.isPowerOfThree(n); 
         
        System.out.println(ans);

    }
    
}
