 
 import java.util.*;
 public class Stack_problem1 {  
    static void pushAtBottom( Stack<Integer> s, int data){
        if(s.isEmpty()){ 
            s.push(data); 
            return;
        } 
         
        int top = s.pop(); // one by one pop top element
        pushAtBottom(s, data); 
        s.push(top);//one by one push top element
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
         
        s.push(1);
        s.push(2);
        s.push(3); 
          
        pushAtBottom(s, 4);
       // System.out.println(s); 
       while(!s.isEmpty()){ 
        System.out.println(s.peek()); 
        s.pop();
       }
    }
    
}
