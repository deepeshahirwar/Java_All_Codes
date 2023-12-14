
 public class SpiralMatrix{ 
    public static void main(String [] args){ 
         
        int matrix[][] = {{1,2,3,4}, 
                          {5,6,7,8}, 
                          {9,10,11,12}, 
                          {13,14,15,16}};  
        int sRow =0; 
        int sCol =0;
        int eRow = matrix.length -1; 
        int eCol = matrix[0].length-1; 
        
        while(sRow <= eRow && sCol <= eCol){ 
            //for top 
            for(int i =sCol; i<=eCol; i++){ 
                System.out.print(matrix[sRow][i]+" ");
            } 
             
            //for  right 
         for(int j =sRow+1; j<=eRow; j++){ 
         System.out.print(matrix[j][eRow]+" ");
         }  
         //for bottom 
         for(int i = eCol-1; i>=sCol; i--){ 
            System.out.print(matrix[eCol][i]+" ");
         }
         //for left 
         for(int j = eRow-1; j>=sRow+1; j--){ 
            System.out.print(matrix[j][sRow]+" ");  
         } 
         sRow++; 
         sCol++; 
         eRow--; 
         eCol--; 

        }
        System.out.println();

    }
}