public class MergeSort{  
    public static void conquer(int arr[],int si,int mid,int ei){ 
int merge[] = new int [ei-si+1];//create new arr 
 
int idx1 = si;//arr 1 
int idx2 = mid + 1;//arr 2 
int oriArridx = 0; 
 
while(idx1 <= mid && idx2 <= ei){ //for arr1 & arr 2
    if(arr[idx1] <=arr[idx2]){ 
        merge[oriArridx ++] = arr[idx1 ++];
    } 
    else 
    { 
        merge[oriArridx ++] = arr[idx2 ++];  
    }
} 
 
while(idx1 <= mid){ //arr 1
    merge[oriArridx ++] = arr[idx1 ++]; 
} 
 
while(idx2 <= ei){//arr 2 
    merge[oriArridx ++] = arr[idx2 ++]; 
} 
 //for  element copy merge arr to -> origenal arr 
  
 for(int i =0, j=si; i<merge.length; i++,j++){ 
    arr[j] = merge[i];
 }
    }
     
   public static  void divide(int arr[],int si,int ei){ 
        //base case 
        if(si >= ei){ 
            return ; 
        } 
         
        int mid = (si + ei)/2; 
        divide(arr,si,mid);//sub arr 1 
        divide(arr,mid+1,ei); //sub arr 2
        conquer(arr,si,mid,ei);
    }
  public static void main(String []arg){ 
    int arr[] ={4000000,100000,300000,2000000,1000000}; 
    int n=arr.length;  
    divide(arr,0,n-1);//for call
//for print 
for(int i=0; i<n; i++){ 
    System.out.print(arr[i]+" ");
} 
System.out.println();
 
  }  
}