public class DeleteElementInArray{ 
    public static  void main(String args[]){ 
        int  arr[] = {10, 20, 30, 40}; 
        int del_element = 20; 
         int count =0; 
         for(int i=0; i<arr.length; i++){ 
            if(arr[i]==del_element){ 
                for(int j=i; j<arr.length-1; j++){  
                    //for all element left shift
                    arr[j] = arr[j+1];
                } 
                count++; 
                break;
            }
         } 
        if (count == 0){ 
            System.out.println("element no found : ");
        } 
        else{ 
            System.out.println("element deleted successfully :");
        } 
        //after delete  element array 
        for(int i = 0; i < arr.length-1; i++ ){ 
            System.out.print(arr[i]+" ");
        }
    }
}