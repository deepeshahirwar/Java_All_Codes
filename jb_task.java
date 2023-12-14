public class jb_task { 
    public static void main(String[] args) { 
        try{
        int  arr[] = new int [3]; 
        arr[0]=10; 
        arr[1]= 20; 
        arr[2]= 30;
        System.out.println(arr[5]);  
        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println(e);
        }  
        System.out.println("rest of the code executed");

         try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");
    }

    
}
