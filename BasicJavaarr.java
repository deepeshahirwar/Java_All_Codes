class BasicJavaarr{ 
    public static void main(String[] args) { 
        int arr[] ={1,2,3,4,5,6,7,8};
        int key =5; 
        int size = arr.length;  
        int index=0; 
        //for finding element
        for(int i=0; i<size; i++){  
            System.out.print(arr[i]+" ");
            if(arr[i]==key){ 
             index= i; 
             break;
            } 

        } 
        System.out.println("key pesent at index : "+index); 
        //for sckip element  
        for(int i=0; i<size; i++){  
           // System.out.print(arr[i]+" ");
            if(arr[i]==key){ 
             index= i; 
             continue;
            }  
            System.out.print(arr[i]+" ");
        } 

    }
}