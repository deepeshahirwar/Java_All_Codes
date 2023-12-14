 /*class Exceptoin {
 public static void main(String[] args)
{

 int div=20/0;

    System.out.println(div);
}
}*/ 
public class Exception{  
    public static void main(String args[]){  
     try{  
        //code that may raise exception  
        String s = null;
     }catch(ArithmeticException e){System.out.println(e);}  
     //rest code of the program   
     System.out.println(s.length());  
    }  
  }  