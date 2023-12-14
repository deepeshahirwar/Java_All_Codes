 public class Factorial1{  //fobonochi series
    static int n1=0,n2=1,n3=0; 
   static  void fibo(int n){ 
        if(n>0){ 
            n3=n1+n2; 
            n1=n2; 
            n2=n3; 
            System.out.print(" "+n3); 
            fibo(n-1); 
    } 
    } 
        public static void main(String []a){ 
            int n=10; 
            System.out.print(n1+" " +n2); 
            fibo(n-2);
        }
    

}