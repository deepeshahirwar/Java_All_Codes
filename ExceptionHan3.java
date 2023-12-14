public class ExceptionHan3 {  
    public static void main(String[] args) { 
        // int arr[] = new int[3]; 
        // arr[0]=1; 
        // arr[1]=2; 
        // arr[2]=3; 
         
        // arr[5]=10;
    //it will give error:  
    //java.lang.ArrayIndexOutOfBoundsException index 5 out of  bound   
     
    //code for handle the eception 
    try{ 
        int arr[] = new int[3]; 
        arr[0]=1; 
        arr[1]=2; 
        arr[2]=3; 
         
        System.out.println(arr[5]);
        //may throw exception
    } 
       // handling the array exception  
       catch(ArrayIndexOutOfBoundsException e)  
       {  
           System.out.println(e);  
       }  
       System.out.println("rest of the code");  
    }
    
}
