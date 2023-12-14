public class JavaExceptionEg{  
    public static void main(String args[]){  
     /*try{  
        //code that may raise exception  
        int data=100/0;  
     }catch(ArithmeticException e){System.out.println(e);}  
     //rest code of the program   
     System.out.println("rest of the code..."); 
      */  
       
//statement1
       int num1 =25/1; 
       System.out.println(num1); 
//statement2
       int num2 =25/2; 
       System.out.println(num2);  
//statement3
       int num3 =25/3; 
       System.out.println(num3); 
//statement4
      int num= 25/0;//exception occurs 
      System.out.println(num1);  
//statement5
      int num4 =25/4; 
       System.out.println(num4); 
//statement6
       int num5 =25/5; 
       System.out.println(num5);
      
 // statement 4,5,6 is not executed      
    } 
     
    
}