 import java.util.*;
 public class Arrays1{ 
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        System.out.print(" enter your array size :");
        int n =sc.nextInt();  
        int len = Math.floorDiv(n , 2);
        //array declaration 
        int arr[] = new int[n]; 
        //for array input  
        System.out.print(" enter your array element :");
        for(int i=0; i<n; i++){ 
            arr[i]=sc.nextInt();
        }  
        int temp; 
        for(int i=0; i<len; i++){  
            temp = arr[i]; 
            arr[i]=arr[n-i-1]; 
            arr[n-i-1]=temp;
          //  swap(arr[i],arr[n-i-1]);
        }
        //for printing reverse array  
        System.out.print("Reverse array is : ");
        for( int i=0; i<n; i++){ 
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
        //for maximun element in array 
        int max=0; 
        for(int element : arr){ 
            if(element > max){  
                max = element;

            }
        }
        System.out.println("maximum is "+max); 
         
        //for manimun element in array 
        int min=100000; 
        for(int element : arr){ 
            if(element < min){  
                min = element;

            }
        }
        System.out.println("maximum is "+min);
    }
}