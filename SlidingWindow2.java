import java.util.ArrayList;

public class SlidingWindow2 { 
    public static void main(String[] args) {
         
        int n = 10; 
        int K= 4; 
        int arr[]={8,5,1,7,9,4,15,12,90,13};   

       // int arr1[]= new int[n-2]; 
         
        ArrayList<Integer> list = new ArrayList<>();
         
        //sliding window approach 
        int i =0; 
        int j=0; 
         
        int max = Integer.MIN_VALUE; 
         
        while(j < n){ 
            
            if(j-i+1 < K){ 
                j++;
            } 
            else if( j-i+1 == K){ 
                for(int k =i; k<=j; k++){  
                 max = Math.max(arr[k] , max);
                       // list.add(max);  
                    }  
                     list.add(max); 
                i++; 
                j++;  
            }
        }
//for print arr1 elements 
for(int el =0; el<list.size(); el++){ 
System.out.println(list.get(el)+" ");
}
    }
    
}
