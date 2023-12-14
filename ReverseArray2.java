public  class ReverseArray2{ 
    public static void main(String []agrs){ 
        int arr[] = { 1,2,3,4,5}; 
        int n= arr.length; 
        int l = Math.floorDiv(n,2); 

        for(int i=0; i<n/2; i++){ 
            if(n > 1){ 
            int temp = arr[i]; 
            arr[i] = arr[n-1-i]; 
            arr[n-1-i] = temp; 
            }
        } 
        for(int i: arr){ 
        System.out.print(i+" ");
        }
    }
}