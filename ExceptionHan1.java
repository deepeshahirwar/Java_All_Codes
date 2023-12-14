 //use of try catch and finally  
 //block in exceptin handling
 public class ExceptionHan1 { 
    public static void main(String[] args) {
      try{ 
        System.out.println("inside try block"); 
        int data = 20/0; 
        System.out.println(data);
      }  
      catch(ArithmeticException e){ 
        System.out.println("Exception handled");  
        System.out.println(e);  
      } 
       
      finally{ 
        System.out.println("finally block is always executed");
      } 
      System.out.println("rest of the code...");

    }
    
}
