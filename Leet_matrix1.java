 import java.util.Collections;
 public class Leet_matrix1 {
    public static void main(String[] args) {
          
        int mat[][]=  {{1,0,0,0}, 
                      {1,1,1,1}, 
                      {1,0,0,0}, 
                      {1,0,0,0}}; 
                        
                      int k =2;
                       
        int n = mat.length; 
        int m =mat[0].length; 
        int i=0; 
        int j=0;  
        int arr[] = new int[n];
          int cnt =0;
          while(i<n){
         for( j=0; j<m; j++){ 
            if(mat[i][j]==1){
                cnt++;
            }
         } 
         if(j==m){  
             arr[i]=cnt;
           i++; 
           cnt=0;  
         } 
          } 
          //for sort 
      int row[] = new int [n]; 
         for( i=0; i<n; i++){  
            row[i]=i; 
         }  
       
         //sort 
         for( i=0; i<n; i++){ 
             for( j=i+1; j<n; j++){  
                 if(arr[i]>arr[j]){
            //    Collections.swap(arr[i],arr[j]); 
            //    Collections.swap(row[i],row[j]); 
            int temp =arr[i]; 
            arr[i]=arr[j]; 
            arr[j]=temp; 
              
            int temp1 =row[i]; 
            row[i]=row[j]; 
            row[j]=temp1; 
            
                 } 
             } 
            }
 //for get k weakest row  
 int ans[]= new int[k];
 for( i=0; i<k; i++){
ans[i]=row[i];
 }

           for( i=0; i<k; i++){ 
            System.out.print(ans[i]+" ");
           }      
    }

}
