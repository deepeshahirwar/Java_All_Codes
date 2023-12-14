public class AvoidNullPtr {
    public static void main(String[] args) {
        String str = null; 
      
    String msg = (str == null)? "null value":str.concat("JTP");
       
    System.out.println(msg);
      str ="java"; 
      msg = (str == null)? "null value":str.concat("JTP");
      System.out.println(msg); 
    }
}
