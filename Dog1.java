class Animal{ 
    void eat(){ 
        System.out.println("Animal is eating :");
    } 
    void Sleep(){ 
        System.out.println("Animal is sleeping :");
    }
} 
class Dog extends Animal{  
void eat(){ 
    System.out.println("dog is eating :");
} 
} 
class Dog1 extends Dog{  
    
    public static void main(String[]args){ 
        Animal a= new Dog1(); 
        a.eat(); 
        a.Sleep();
    }
}
       