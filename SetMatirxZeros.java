 import java.util.*;
 public class SetMatirxZeros{ 
   // static canConstruct 
    public static void main(String[] args) { 
int  matrix[][]={{1,2,3}, 
                 {4,0,6},
                 {7,8,9}}; 

                 int row=matrix.length; 
                 int col =matrix[0].length; 
                  
                 int copymat[][]=new int[row][col]; 
                  
                 copymat=matrix;  
                  
                 for(int i=0; i<row; i++){ 
                  for(int j=0; j<col;  j++){ 
                  if(matrix[i][j]==0){  
                     //for row zeros
                     for(int r=0; r<col;  r++){ 
                        copymat[i][r]=0;
                     }
                  } 

                  } 
                 } 
                  
                 for(int i=0; i<row;  i++){ 
                  for(int j=0; j<col;  j++){ 
                  if(matrix[i][j]==0){  
                     //for col zeros
                     for(int c=0; c<col;  c++){ 
                        copymat[c][j]=0;
                     }
                  } 
                  
                  } 
                 } 
                 //for updated  copymat  copy into  orignal matrix 
                 matrix = copymat;
               
  //for printing updated matrix; 
  for(int i=0; i<row; ++i){ 
   for(int j=0; j<col; ++j){ 
      System.out.print(matrix[i][j]+" ");
   } 
   System.out.println();

  }

        
    }
    
}
