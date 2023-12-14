public class Exception2{  //lecture 2
    /*  public static void main(String args[]){ //problem ->1 
     try{  
        //code that may raise exception  
        int [] arr=new int[4];
     }catch(ArithmeticException  e){System.out.println(e);}  
     //rest code of the program   
     System.out.println("hi i want to execlude ");  
    } */ 
     
    public static void main(String args[]){//problem->2  
      try{  
         //code that may raise exception  
         int dbz=10/0;
      }//catch(ArithmeticException  e){System.out.println(e);}  
      //rest code of the program   
      finally{ 
      System.out.println("this is finally bloack  "); 
   }  
   System.out.println("hello"); 
     }  
  }  