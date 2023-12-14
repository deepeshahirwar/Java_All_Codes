 import java.util.*;
 public class Matrix2 {  
    //for finding  kth row of max element 
    static void kthRowMaxElement(int mat[][], int n, int m,int k){ 
 
        int maxEle = Integer.MIN_VALUE;  
        for(int i=k; i<n; i++){ 
            for(int j=0; j<m; j++){ 
                if(i == k && mat[i][j] > maxEle) 
                maxEle = mat[i][j];
            }
        } 
        System.out.println("row is"+k);
   System.out.println("kthRowMaxElement is "+maxEle);
    } 
     
     //for finding  kth col of max element 
    static void kthColMaxElement(int mat[][], int n, int m,int k){ 
 
        int maxEle = Integer.MIN_VALUE;  
        for(int j=k; j<m; j++){ 
            for(int i=0; i<n; i++){ 
                if(j == k && mat[i][j] > maxEle) 
                maxEle = mat[i][j];
            }
        } 
        System.out.println("col is"+k);
   System.out.println("kthColMaxElement is "+maxEle);
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
        } 
        System.out.println();
       //print matrix 
       for(int i=0; i<n; i++){ 
        for(int j=0; j<m; j++){ 
       System.out.print(mat[i][j]+" ");
        } 
        System.out.println();
    } 
     
    int row =1;
     
    kthRowMaxElement(mat,n,m,row);
   kthColMaxElement(mat,n,m,row); 
    
    } 
}
