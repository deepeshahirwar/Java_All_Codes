public class Abstraction1{
    
    public static void main(String args[ ]){
      Horse h = new Horse(); 
       h.eat(); 
       h.walk(); 
        
       Elephent e = new Elephent(); 
       e.eat(); 
       e.walk();
        

    }

} 
//base class
abstract class Animal {  
    //non abstract method 
    void eat(){ 
        System.out.println("animal eats : ");
    }  
     
    //abstract method 
    abstract void walk(); 
} 
 
//derived class1 
class Horse extends Animal{ 
    void walk(){ 
        System.out.println("walk on 4 leg1 :");  
    }
} 
 //derived class2 
 class Elephent  extends Animal{ 
    void walk(){ 
        System.out.println("walk  slow on 4 leg2 :");  
    }
} 



     


