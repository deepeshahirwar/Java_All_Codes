 import java.util.*;
 public class Matrix5 { 
    public static void main(String[]args) 
    {  
      Scanner sc=new Scanner(System.in); 
      int row=sc.nextInt();
      int col=sc.nextInt();  
      int[][] num=new int[row][col]; 
      //input 
      //for row 
      for(int i=0; i<row; i++);{ 
        //column 
        for(int j=0; j<col; j++);{ 
          num[row][col]=sc.nextInt(); 
        } 
      }  
//output 
for(int i=0;i<row; i++);{ 
  for(int j=0;j<col; j++);{ 
    System.out.print(num[row][col]+" ");
      //  System.out.println();
    } 
  
    System.out.println();
}  
    } 
  }
    
