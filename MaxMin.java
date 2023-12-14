public class MaxMin{ 
    public static void main(String []as){  
    int arr[] = {1,2,3,4,5}; 
    int size = arr.length; 
      
    //for max vaue and min value
   /*  int a=20; 
    int b=12; 
    int maxi = Math.max(a,b); 
    int mini = Math.min(a,b);

    System.out.println("max is  "+maxi); 
    System.out.println("max is  "+mini); 
    */  
    int max = Integer.MIN_VALUE;  
    int min = Integer.MAX_VALUE;  
    //for max value 
    for(int i=0; i<size; i++){ 
        if(arr[i] > max){ 
            max = arr[i];
        }
    } 
    System.out.println("maximum value  is  "+max); 
 
     //for min value 
     for(int i=0; i<size; i++){ 
        if(arr[i] < min){ 
            min = arr[i];
        }
    } 
    System.out.println("maximum value  is  "+min); 

  

    }
}