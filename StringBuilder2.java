 /*  To change first latter of String 
   in upperCase eg.  
   amit = Amit 
   deepu= Deepu */ 

  public class StringBuilder2{ 
     public static String toUpperCase(String str){ 
        StringBuilder sb = new StringBuilder(""); 
         //for first latter upper
        char ch = Character.toUpperCase(str.charAt(0)); 
        sb.append(ch); 
         
        for(int i=1; i<str.length(); i++){ 
            //for find space 
            if(str.charAt(i) == ' ' && i< str.length() -1 ){  
                sb.append(str.charAt(i)); 
                i++; 
                sb.append( Character.toUpperCase(str.charAt(i)));
            }else{ 
                sb.append(str.charAt(i));
            }
        } 
        return sb.toString();
     }
    public static void main(String []args){ 
         String str = "hi i am deepesh";  
        System.out.print(toUpperCase(str));

        } 
    
    } 
 
        