  
  import java.util.Stack;
/*stack follow the LIFO property (last in fist out) */
 public class CollStack {  
    public static void main(String[] args) {
        
    
    Stack<String> animals = new Stack<>(); 
    animals.push("lion"); 
    animals.push("dog"); 
    animals.push("horse"); 
    animals.push("cat");  
     
    System.out.println("stack :"+ animals); 
     
    animals.pop(); 
    System.out.println(animals); 
    animals.push("elephent"); 
     
    System.out.println(animals); 
    System.out.println("peek animal is : "+animals.peek()); 

    animals.pop();  
    
    System.out.println(animals);  
    System.out.println("peek animal is : "+animals.peek());
    }  
}
