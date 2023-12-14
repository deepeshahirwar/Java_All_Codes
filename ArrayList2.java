 import java.util.ArrayList; 
 import java.util.Scanner; 
  
 //program for find maximum elemnt int entire Arraylist
 public class ArrayList2{  
   static int maximum(ArrayList<Integer>arr, int n){ 
      int maxi = Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
         if(arr.get(i) > maxi){
            maxi = arr.get(i);
         }
      } 
      return maxi;
   }
    public static void main(String []args){   
        Scanner sc = new Scanner(System.in);  
       System.out.println("enter ArrayList size : "); 

        int n = sc.nextInt();
        //creation of ArrayList 
        ArrayList<Integer> arr = new ArrayList<Integer>();  
        //for input ArrayList 
       System.out.println("enter ArrayList elements : "); 
         for(int i=0; i<n; i++){ 
            arr.add(sc.nextInt());
         } 
           
          System.out.println(arr +" ");
         // max function call 
      int maximum_num =maximum(arr, n); 
      System.out.println("maximum value is : " + maximum_num);
          
        
          sc.close();

        

    }
}