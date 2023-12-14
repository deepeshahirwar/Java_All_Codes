import java.util.*;
public class ReverseStack {  
    static void reverse_stack(Stack<Integer> s){  
        Stack<Integer> rev = new Stack<>();  
         
        while(!s.isEmpty()){ 
            int top = s.pop(); 
         
            rev.push(top); 
               
        }
       
        System.out.println("Revarse stack ->"+rev);
    }//TC -> O(N); 
    //SC-> O(N);  
     
    static void reverse_stack2(Stack<Integer> s){  
        Stack<Integer> rev = new Stack<>();  
         
       
            int top = s.pop();  
            reverse_stack2(s);
            s.push(top);
         
            
        System.out.println("Revarse stack ->"+s);
    }//TC -> O(N); 
     

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);  
        System.out.println("orignal stack -> "+s); 
        reverse_stack(s);

    }
    
}
