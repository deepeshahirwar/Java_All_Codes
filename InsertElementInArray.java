public class InsertElementInArray{ 
    public static void main(String []args){ 
        int arr[]={10,20,30,40,50}; 
        int pos = 3; 
        int element =100; 
        int lastElement = arr[arr.length-1]; 
         
         for(int i=arr.length-1; i>pos-1; i--){ 
            arr[i]=arr[i-1];//for left shift element 

        } 
        
        arr[pos-1]=element;
         
        for(int i=0; i<arr.length; i++){ 
            System.out.print(arr[i]+" ");
        } 
       // System.out.print(lastElement);
    }
}