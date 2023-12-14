 import java.util.*;
 public class IsPrime{ 
    public static void main(String[]args){ 
boolean arr[] =isPrime(10); 
for(int i=0; i<=10; i++ ){  
    if(arr[i]==true){ 
        System.out.println(i);   
    }
    //System.out.println(i+" "+arr[i]);
}
    } 
    static boolean[] isPrime(int n){ 
        boolean arr[] = new boolean[n+1];// for we consider 0  
        Arrays.fill(arr,true);  

        arr[0]=false; 
        arr[1]=false; 

        for(int i=2; i*i <= n; i++ ){ 
            //for mark 2's dibisible false 
          for(int j=2*i; j<=n; j +=i){ 
          arr[j]=false;
          } 

        }
         
        return arr;
    }
}