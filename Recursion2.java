  import java.util.*;
  public class Recursion2{ 
    public static void factorial(int n){ 

        if(n==0){ //base code
             return;

        } 

factorial(n-1);  
    }
     //work
//int fac_n=n*fac_nm; 
//return fac_n;
     
public static void main(String[]args){ 
    Scanner Sc=new Scanner(System.in); 
    int n=Sc.nextInt(); 
    int ans=factorial(n); //method colling 
    System.out.println(ans); 

    
}
}