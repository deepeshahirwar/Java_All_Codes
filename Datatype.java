public class Datatype{ 
    public static void main(String[] args) {
        int a = 10; 
        byte by =127; 
        short st = 12;  
        long l = 12345l; 
        float f =2.5f; 
        double d =12344.567; 
         
        char  ch = 'c'; 
         
        boolean b = true;
         
        int n1=100; 
        int n2=12; 
        byte b1 = (byte)(n1+n2); 
         
        /*we can store the multiple value of  
         little datatypes into big datatypes */ 
          
         /* but we cannot store the multiple value of  
         big  datatypes into little datatypes */ 
          
         double d1 = 123.445; 
         double d2 = 48383.456; 
        // byte bt = d1 + d2; 
         //error -> lossy conversion from double to byte
         //byte bt = d1 + d2; 

       // System.out.println(bt);
        System.out.println(b1);

    }
}