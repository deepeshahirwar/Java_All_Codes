  //for count prime number from 0 to n;
  import java.util.*;
 public class CountPrime { 
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt(); 
     
    boolean prime[] = new boolean[n+1]; 
    Arrays.fill(prime,true); 
     
    prime[0] = false; 
    prime[1]=false; 
     
    //mark non-prime as a false
    for(int i=2; i<=Math.sqrt(n); i++){ 
        for(int j=i*i; j<=n; j=j+i){ 
            prime[j]=false;
        }
    } 
   //for count prime number from 2 to n
    int count =0;
    for(int i=2; i<=n; i++){ 
        if(prime[i]==true){ 
            System.out.print(i+" "); 
            count++;
        }
    }  
    System.out.println();
    System.out.println(count);
    
}//tc -> O(nlog(logn))
    
}
