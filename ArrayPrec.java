/*  import java.util.*; 
 import java.util.Arrays;
 class ArrayPrec{ 
    public static void main(String[]args){  
       // System.out.print(" ");
        int a[]=new int [5] ; 
        Scanner sc=new Scanner(System.in);  
        System.out.print("enter array element: ");
        for(int i=0;i<a.length;i++){ //for -each loop
         a[i]=sc.nextInt();
        } 
        Arrays.sort(a);//for sort array 
        for(int i=0;i<a.length;i++){ //for -each loop
            System.out.print(a[i]+" ");
           } 

    }
}*/ 
import java.util.*; 
 import java.util.Arrays;
 class ArrayPrec{ 
    public static void main(String[]args){  
       // System.out.print(" ");
       int a[]=new int [5] ;  
       int a1[]=new int [4] ; 
        Scanner sc=new Scanner(System.in);  
        boolean B=false; 
        boolean b=Arrays.equals(a,a1); 
      //  if(a==a1) 
        System.out.println("kya dno array eqal hai :"+b);  
    } 
}