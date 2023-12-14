public class ExceptionHan2 { 
    public static void main(String[] args) {
      System.out.println("statment 1"); 
      System.out.println("statment 2"); 
      System.out.println("statment 3");    
     //till statment 3 executed    
        // int i =20; 
        // int j =0; 
        // int data = i/j;  
        //throw exception ArithmeticException
        // System.out.println(data); 

      //these statment are not executed
        System.out.println("statment 4"); 
        System.out.println("statment 5"); 
        System.out.println("statment 6"); 
        System.out.println("statment 7"); 
         
        try{ 
            
            int data2 = 20/0; 
            System.out.println("it is executed : "+data2); 
        } 
        catch(ArithmeticException e){ 
            System.out.println(e); 

        } 
        System.out.println("rest of the code executed : ");
    } 

    }
    

