import java.util.*;
 public class GCD{  
    //for two number
    static int gcd(int a,int b){ 
        return b==0 ? a : gcd(b, a%b);
    }  
//for n number
    static int gcdOfNNum(int a[], int n){  
        int ans =0; 
        for(int i=0; i<n; i++){ 
            ans = gcd(ans,a[i]);
        } 
        if(ans == 1){ 
            return 1;
        } 
        return ans;

    }
    public static void main(String[]args){   
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        int n = sc.nextInt();  
        int a[] = new int[n];
 
        for(int i=0; i<n; i++){ 
            a[i]=sc.nextInt();
        }
        // int a[]={1,2,3};  
        // int n = a.length; 
        
       // System.out.println( gcdOfNNum(a,n)); 
       int result = gcdOfNNum(a,n); 
       System.out.println(result);
}
} 
