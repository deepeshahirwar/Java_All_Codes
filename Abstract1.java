public class Abstract1 { 
    public static void main(String[] args) {
        Bmw obj = new Bmw(); 
        obj.gair();  
        obj.speed();
    }
    
} 
//create abstract class 
abstract class Car{ 
    //non abstract method 
    void speed(){ 
        System.out.println("120/h");
    }  
    //abnstract  method
    abstract void gair();
} 
class Bmw extends Car{ 
    void gair(){ 
        System.out.println("5 gair");
    }
}
