

public class Find_Duplicate {  
public static void main(String[] args) {
    int arr[] = {1,2,3,4,4};  
    int n = arr.length; 
     
    int ans = n*(n-1)/2; 
     
    int sum =0; 
     for( int i=0; i<n; i++){ 
        sum +=arr[i];
     }  

      
     System.out.println("duplicate elememnt is : "+(sum-ans));
}

}
