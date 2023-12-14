public class Maths1 {
    public static void main(String[] args) { 
        int a = -1;  
        System.out.println(a);
        System.out.println(Math.abs(a)); 
       
        //round() 
        /*It is used to round of the decimal numbers to the nearest value. */ 

        double n1 =10.8433; 
        System.out.println(Math.round(n1)); 
         
    int   n2 =8; 
    System.out.println(Math.sqrt(n2)); 
    System.out.println(Math.cbrt(n2)); 
    System.out.println(Math.pow(n2,2));  
     
     int n3 = 25; 
     int n4 = 3; 
     // 25/3 value is 8.33 so floor(8.33) = 8  
     System.out.println(Math.floorDiv(n3,n4));
     
    
        
    }
}
