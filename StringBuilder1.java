 /*find largest String in lexographical order  
  eg. ab < bc < cf < mg ..  etc */
  public class StringBuilder1{ 
     
    public static void main(String []args){ 
        //creation of  StringBuilder 
        StringBuilder sb = new StringBuilder(""); 
        //for inserting a to z alpha 
        for(char ch = 'A'; ch <= 'Z'; ch++){ 
            sb.append(ch);//for inserting in back of the sb
        } 
        //tc -> O(26);
        System.out.println(sb);        
        } 
    
    } 
 
        