 import java.util.*;
 public class Matirx1 {  
    //for row wise sum 
    static void rowSum(int mat[][],int n1, int m1){ 
        System.out.println("row wise sum : ");   
         
        int max =Integer.MIN_VALUE;

        for(int i=0; i<n1; i++){   
            int sum =0;

            for(int j=0; j<m1; j++){ 
           sum += mat[i][j]; 
            
            }  
            if(sum > max) 
            max = sum;
         System.out.println(sum); 
    }  
    System.out.println("col wise max sum element "+max);      
} 
// for coloum wise sum  
static void colSum(int mat[][],int n1, int m1){ 
    System.out.println("row wise sum : "); 
    int max =Integer.MIN_VALUE;  

    for(int j=0; j<m1; j++){   
        int sum =0;

        for(int i=0; i<n1; i++){ 
       sum += mat[i][j]; 
        
        }  
        if(sum > max) 
        max= sum;
     System.out.println(sum);
      
}   
System.out.println("col wise max sum element "+max);     
} 

    public static void main(String[] args) { 

        Scanner sc =new Scanner(System.in);  
        int n =sc.nextInt();  
        int m =sc.nextInt();  

        int mat[][] = new int[n][m];
         
        for(int i=0; i<n; i++){ 
            for(int j=0; j<m; j++){ 
                mat[i][j] = sc.nextInt();
            }
        }System.out.println();
       //print matrix 
       for(int i=0; i<n; i++){ 
        for(int j=0; j<m; j++){ 
       System.out.print(mat[i][j]+" ");
        } 
        System.out.println();
    }  
     System.out.println(); 
      
     rowSum(mat, n, m); 
     colSum(mat, n, m); 

        
    }
    
}
