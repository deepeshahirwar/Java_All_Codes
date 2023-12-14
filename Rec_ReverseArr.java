 public class Rec_ReverseArr{  
    //for revesing array
static  void reveseArr(int arr[], int  start, int end){ 
    int temp ; 
    while( start < end){ 
        temp = arr[start]; 
        arr[start]=arr[end]; 
        arr[end] = temp; 
         
        start++; 
        end--;
    }
} 
//for print the array 
static void printArr(int arr[],int size){ 
    for(int  i=0; i<size; i++){ 
        System.out.print(arr[i]+" ");
    } 
    System.out.println();
}
 
 public static void main(String []args){  

int arr[] = { 1,2,3,4,5}; 
int n= arr.length; 
 
printArr(arr,n); 
reveseArr(arr,0,4); 
System.out.println("Reverse array is ");
printArr(arr,n);  

} 
 }