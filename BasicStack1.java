 import java.util.Stack;

import javax.swing.SortOrder;
 public class BasicStack1 { 
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>(); 
       stack.push(1);  
       stack.push(2);  
       stack.push(3);  
       stack.push(4);  
       stack.push(5);  
       int element = stack.search(5); 
       System.out.println(element); 
    int top = stack.peek(); 
    System.out.println(top); 
    while(!stack.empty()){
        top = stack.pop(); 
        System.out.println(top); 
    } 
    System.out.println(stack.empty()); 
    System.out.println(stack.contains(1));
    }
    
}
