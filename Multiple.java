class Animal5{ 
    void eat(){
        System.out.println("eating");
    }
} 
class Dog extends Animal5{
     void eat(){
        System.out.println("eating dog");
    }  
}class MyDog extends Dog{
    void eat(){
        System.out.println("eating mydog");
    }  
} 
class Multiple{
    public static void main(String[]arg){
     Animal5 a1,a2,a3; 
        a1=new Animal5(); 
        a2=new Dog(); 
        a3=new MyDog(); 
        a1.eat(); 
        a2.eat(); 
        a3.eat (); 
    }
}