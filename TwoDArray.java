 import java.util.*;
 public class TwoDArray{  
    boolean Search(int arr[],int target){  
       int row = arr.length; 
       int col = arr[0].length; 
        
       int s=0; 
       int e = row*col-1; 
       int mid = (s+e)/2; 
        
       while(s <= e){ 
        int element = arr[mid/col][mid % col]; 
         
        if (element ==target){ 
            return true;
        } 
        else if ( element > target){ 
            s = mid-1;
        } 
        else 
        { 
             e = mid+1;
        }
       }
       return false; 
    }
    public static void main(String []args){   
        Scanner sc = new Scanner(System.in); 

        int row = sc.nextInt();
        int  col = sc.nextInt(); 

      int [][]arr = new int[row][col];  

      for(int i=0; i<row; i++){  

        for(int j=0; j<col; j++){ 
       arr[i][j]=sc.nextInt();
        }
      }
      //obj create   
      TwoDArray obj = new TwoDArray(); 
      obj.Search(arr,3);

    }
}