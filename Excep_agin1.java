public class Excep_agin1 { 
   
        public static void main(String args[]){ 
            // int num = 100/0; 
            // System.out.println(num); it will give  exeception 
            // eg-1 
            // try{
            //    int num = 100/0;   
            // }catch(ArithmeticException e){
            //     System.out.println(e); 
                 
            //     System.out.println("rest of the code are executed..");
            // } 
 //<---------------------------------------------------------------------> 

            // eg-2 
           // String s = null; 
            // System.out.println(s.length());//NullPointerException 
            //  try{
            //    String s = null; 
            //    System.out.println(s.length());    
            // }catch(NullPointerException e){
            //     System.out.println(e); 
                  
            //     System.out.println("rest of the code are executed..");
            // }
          
//<------------------------------------------------------------------------>             
            //eg-3  
            //  String s = "abc";  
            //    int num = Integer.parseInt(s);
            //  try{
            //    String s = "abc";  
            //    int num = Integer.parseInt(s);//NumberFormatException  
           
            // }catch(NumberFormatException e){
            //     System.out.println(e); 
                  
            //     System.out.println("rest of the code are executed..");
            // } 
             
    //<---------------------------------------------------->          
             //eg-4  
            //  int arr[] = new int[3] ;
            //   System.out.println(arr[5]);//ArrayIndexOutOfBoundsException  
             try{
               int arr[] = new int[3];
              System.out.println(arr[5]);
           
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e); 
                  
                System.out.println("rest of the code are executed..");
            }
    }   
}
