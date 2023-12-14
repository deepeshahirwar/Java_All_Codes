public class DiagonalOfMatrix{  
     
    public  static void maxEleOfmatrixDiagonal(int mat[][], int n){ 
        //for primary diagonal  
        int maxi1 = Integer.MIN_VALUE; 
        int sum1=0;
        for(int i=0; i<n; i++){ 
           // System.out.print(mat[i][i]+" "); 
            // if(mat[i][i] > maxi1){ 
            //     maxi1=mat[i][i];
            // }  
            sum1 +=mat[i][i];
           
        } 
        System.out.println(); 
         
        //for secondary diagonal  
        int maxi2 = Integer.MIN_VALUE; 
        int k= n-1; 
        int sum2 =0;
        for(int i=0; i<n; i++){   
           // System.out.print(mat[i][k--]+" ");
            // if(mat[i][i] > maxi2){ 
            //     maxi2=mat[i][k--];
            // }  
            sum2 +=mat[i][k--];
           
        } 
        System.out.println(); 
         
        // int ans = Math.max(maxi1,maxi2);  
        // System.out.println("diagonal of max element is "+ans); 
         
        int maxSum = Math.max(sum1, sum2);
        System.out.println("diagonal sum of max is : "+maxSum);
    }
    public static void main(String[] args) { 
        int n=3;
        int mat[][]={{1,2,7}, 
                   {4,5,6}, 
                   {7,8,19}}; 
                    
                   maxEleOfmatrixDiagonal(mat,n);            

    }
}