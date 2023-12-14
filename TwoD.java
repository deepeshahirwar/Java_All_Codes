 import java.util.*;
 public class TwoD{
    public static void main(String args[]){ 
       /*  int arr[][] = { {1,2,3}, 
                      {3,4,5}};  
                      int row =2; 
                      int col = 3; 
                     
                      
        for(int i=0; i<row ; i++){ 
            for(int j=0; j<col; j++){ 
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println();
        }*/
     
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter your  row : "); 
        int row =sc.nextInt();  
        System.out.println("enter your  col ") ;
        int col =sc.nextInt();  
       
        //for array  user input 
        int arr[][] = new int[row][col]; 
         
        System.out.println("enter array elements : ") ;
        for(int i=0; i<row; i++){ 
            for(int  j =0; j<col; j++){  

              arr[i][j] = sc.nextInt(); 
              
            }
        } 
        //for array 2D array print 
        System.out.println("your  array elements is : ") ; 
        for(int i=0; i<row; i++){ 
            for(int  j =0; j<col; j++){ 
        System.out.print(arr[i][j]+" "); 

            }System.out.println(); 
        } 

    }
}
 
