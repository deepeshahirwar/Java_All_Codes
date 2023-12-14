public class Sliding_Problem2 { 
     /* find first nagatine integer in window size k*/

    public static void main(String[] args) {
        int arr[] ={-1,6,-12,8,-3,9}; 
        int k =3;//window size 
        int size = arr.length;  
         
        int ans[] = new int[size]
         
        //sliding window approach 
        int i=0; 
        int j=0; 
          
        int sum =0; 
    
        while(j < size){  
            sum += arr[j]; 

            if(j-i+1 < k){ 
                j++;
            } 
            else if(j-i+1 == k ){ 
                max = Math.max(max, sum); 
                 
                sum -=arr[i]; 
                i++; 
                j++;//for next window
            }
        } 
        System.out.println();
    }
    
}

    

