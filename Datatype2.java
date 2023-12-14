public class Datatype2{ 
    public static void main(String[] args) { 
        //litrels 

        int a = 0x7E;  
        int b = 0b101; 
         
        int n1 = 10_00_00_000;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(n1); 
         
        //boolean bo = 1; 
        //System.out.println(bo); 
        //error -> int cannot be converted to boolean
       // boolean bo = 1; 
        
       char ch = 'a'; 
       //ch+++; 
       //error: not a statement  
        
       ch++; 
      ch +=8; 

     // ch = ch +9; 
     //error -> int cannot be converted into char
    
       System.out.println(ch);  

         
    } 
}