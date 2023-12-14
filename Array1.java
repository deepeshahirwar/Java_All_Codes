  //array program
   import java.util.Scanner;
  class Array1{
 public static void main(String [] args){  
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter your array size :");
    int n = sc.nextInt(); 
    //for array input 
    int arr[] = new int[n]; //array create 
    System.out.println("enter your array elements :");
    for(int i=0; i<n; i++){ 
         arr[i] = sc.nextInt();
    } 
    //for print array  
    System.out.println("your array elements is :");
    for(int i=0; i<n; i++){ 
       System.out.print(arr[i]+" ");
    } 

} 
  }