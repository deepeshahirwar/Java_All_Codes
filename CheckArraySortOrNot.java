public class CheckArraySortOrNot {  
    //  static boolean isSorted(int arr[],int i){ 
    //     //base case 
    //     if(i== arr.length-1){ 
    //         return true;
    //     } 
    //     if(arr[i]> arr[i+1]){ 
    //         return false;
    //     } 
         
    //     return isSorted(arr, i+1);
    //  }  
    //  static int  firstOccurence(int arr1[],int i,int key){  
    //     //base case  
    //     if(arr1[i]==key){ 
    //         return i;
    //     } 
    //     if(i== arr1.length-1){ 
    //         return -1;
    //     }
        
    //     return firstOccurence(arr1, i+1, key);
    //  } 
      
 static int lastOccurence(int arr1[], int key ,int i){  
        //base case 
         if( i == arr1.length){ 
            return -1;
         }   
         
          int isFound = lastOccurence(arr1,key,i+1); 
           
          if(isFound == -1 && arr1[i] == key){ 
            return i; 
          }
         
          return isFound;

     }
    public static void main(String[] args) { 
        //int arr[]={1,2,3,4,4,5}; 
       // System.out.println(isSorted(arr,0));  
    int arr1[] ={1,2,5,3,5,5,5};
  System.out.println(lastOccurence(arr1,5,0)); 

}

    
}
