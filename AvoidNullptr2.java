public class AvoidNullptr2 { 
    static int value = 50; 
    public static int getValue(String s){
        if(s == null){
            throw new IllegalArgumentException("argument can not be null");
        } 
        return value;
    }
     public static void main(String[] args) {
        String s = null; 
      
    try{
     System.out.println(getValue(s));   
    } 
    catch(IllegalArgumentException ex){
        System.out.println("IllegalArgumentException ex");
    } 
    
      s ="JTP";  

      try{
     System.out.println(getValue(s)); 
      }  
      catch(IllegalArgumentException ex){
        System.out.println("IllegalArgumentException caught");
    }
  
    }
}
