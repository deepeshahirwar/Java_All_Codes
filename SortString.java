 import java.util.*;
 public class SortString { 
    public static void main(String[] args) { 
         
        String[] contries = {"India","Rushia","America","Australia","japan"}; 
         
        int size = contries.length; 
        //bubble sort 
        for(int i=0; i<size-1; i++){ 
            for(int j =i+1; j< size; j++){ 
                if(contries[i].compareTo(contries[j]) > 0){  

                    String temp = contries[i]; 
                    contries[i] = contries[j]; 
                    contries[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(contries));
    }
    
}
