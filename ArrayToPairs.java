public class ArrayToPairs{  
    public static void printPairs(int arr[],int n){  
        int totalPair =0;
        for(int i=0; i<n; i++){ 
            int curr = arr[i]; 
            for(int j =i+1; j<n; j++){ 
            System.out.print("("+curr+","+arr[j]+")"); 
            totalPair++;
            } 
            System.out.println();
        } 
        System.out.println("total pair is "+ totalPair);
    }
    public static void main(String[]args){ 
        int arr[] = {1,2,3,4,5,6}; 
        int n = arr.length; 
        printPairs(arr,n);
    }
}