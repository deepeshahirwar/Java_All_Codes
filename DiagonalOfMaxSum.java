public class DiagonalOfMaxSum{  
     
    public  static void maxSumOfmatrixDiagonal(int mat[][], int n){ 
        //for primary diagonal  
         
        int sum1=0;
        for(int i=0; i<n; i++){ 
            sum1 +=mat[i][i];
        } 
        System.out.println(); 
         
        //for secondary diagonal  
       
        int k= n-1; 
        int sum2 =0;
        for(int i=0; i<n; i++){   
            sum2 +=mat[i][k--];
        } 
        System.out.println(); 
         
        
        int maxSum = Math.max(sum1, sum2); 
        int SumProduct = sum1*sum2;
         
        System.out.println("diagonal sum of max is : "+maxSum);
        System.out.println("diagonal sum of product is : "+SumProduct);
    }
    public static void main(String[] args) { 
        int n=3;
        int mat[][]={{1,2,7}, 
                   {4,1,6}, 
                   {7,8,8}}; 
                    
                   maxSumOfmatrixDiagonal(mat,n);            

    }
}