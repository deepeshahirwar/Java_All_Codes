public class ARecursion1 {  
     
//  static  void num(int n){ 
//         //base case 
//         if(n==0){ 
//             return ;
//         }  
//         System.out.print(n+" ");
//        num(n-1); 
//       // System.out.print(n+" ");
//     } 
    static int factorial(int n){ 
        if(n==0){ 
            return 1;
        } 
          
        return n*factorial(n-1);
    } 
    static int sumNnum(int n){ 
        if(n==1){ 
            return 1;
        } 
       int snm1= sumNnum(n-1); 
        int sn = n + snm1 ; 
        return sn;
    }
    public static void main(String[] args) {
        int n =5;  
        //num(n); 
        int ans = factorial(n); 
        System.out.println(ans);
 
        System.out.println(sumNnum(n));
    }
    
}
