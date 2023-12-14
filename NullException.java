public class NullException { 
    public static void main(String[] args) {
        String ptr = null; 
      try{
        // this will give  NullPointerException  , because  null ptr compaire with string value 
        if(ptr.equals("ppp")){
            System.out.println("same");
        } 
        else{
            System.out.println(" not same"); 
        }
      } 
      catch(NullPointerException e){
        System.out.println("NullPointerException catch");
      }

    }
}
