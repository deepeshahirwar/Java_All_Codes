  // single inheritance
  //base class 
  class Animal{  
    //prperties
    String coler; 
    int weigth;  
    //methods 
    void eat(){ 
        System.out.println("eats");
    } 
    void breathe(){ 
        System.out.println("breathe");  
    }
} 
//dereved  class 
  class Dog extends Animal{  
    void runing(){ 
        System.out.println("dog is runing ");
    }
} 

 public class SingleInheritance1{ 
    public static void main(String[] args) {
       Dog obj = new Dog();
       obj.eat(); 
       obj.breathe(); 
       obj.runing(); 
    }
} 
