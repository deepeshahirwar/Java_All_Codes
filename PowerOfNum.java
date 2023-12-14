import java.util.stream.IntStream;

public class PowerOfNum {  
  // Recursive approach 
  static int modRecusive(int a, int b, int m){ 
    //base case 
    if( b==0)return 1; 
    //when b is even 
    if(b%2==0){ 
      int temp = modRecusive(a,b/2,m); 
      return (temp%m * temp%m)%m;
    } 
    else{ 
      int temp = modRecusive(a,b/2,m);  
      return ( a %m * temp%m * temp%m)%m;
    }
  } 
   // Iterative approach 
   static int modIterative(int a, int b, int m){   
    int ans =1; 
    while(b!=0){  
      //for b is odd 
      if(b%2!= 0){ 
        ans = ((ans)%m * (a)%m)%m;
      } 
      a= ((a)%m * (a)%m)%m; 
      b = b/2;
    } 
    return ans;
   }
    public static void main(String[] args) {
    int ans1 = modRecusive(13,7,7);  
    int ans2 =modIterative(13,7,7); 

    System.out.println(ans1); 
    System.out.println(ans2);
      
 
          
    }
    
}
