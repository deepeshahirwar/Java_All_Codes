 
 //Hybrid Inheritance 
 //base class 
 class GrandFather{  
    int age; 
    String name; 
    void eat(){ 
        System.out.println("Grand father is eating :");    
    }
 } 
 //derived class 1 
 class Father extends GrandFather{ 
    void sleep(){ 
        System.out.println("father is sleeping :");
    }
 } 
 //derived class 2
 class Child extends GrandFather{ 
    void playing(){ 
        System.out.println("child is playing : ");
    }
 } 
 class Child1 extends Father{ 
    void  read(){ 
        System.out.println("child1 read");
    }
 } 
 class Child2 extends Father{ 
    void  write(){ 
        System.out.println("child2 read");
    }
 }
 public class HybridInheritance{ 
    public static void main(String[] args) {
        Father f = new Father(); 
        Child c = new Child();  
        Child1 c1 = new Child1(); 
        Child2 c2 = new Child2();   
         
       
        f.eat(); 
        c.eat(); 
        c1.sleep(); 
        c2.sleep(); 
        
    } 

}