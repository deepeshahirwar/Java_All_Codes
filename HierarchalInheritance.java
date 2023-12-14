 
 //Hierarchal Inheritance 
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
 public class HierarchalInheritance{ 
    public static void main(String[] args) {
        Father f = new Father(); 
        Child c = new Child();  
        f.name ="Ram"; 
        f.age = 108; 
        System.out.println(f.name); 
        System.out.println(f.age);
        f.eat(); 
        f.sleep(); 
        c.eat(); 
        c.playing();
    } 

}