 /*find largest String in lexographical order  
  eg. ab < bc < cf < mg ..  etc */
 public class String3{ 
     
    public static void main(String []args){ 
        String fruits[] = {"apple", "mango", "banana"};  
         
        String largest = fruits[0];  
        //using compareTo()
        for(int i=1; i<fruits.length; i++){ 
         if(largest.compareTo(fruits[i]) < 0){ 
            largest = fruits[i];
         }
        } 
        System.out.println(largest);
    } 
} 
        