
 public class Man{
    public static void eat(){
        System.out.println("Eating man ");
    }
}
public class People extends Man{
    public static void eat1(){
    System.out.println("people is eating ");
}
}
public class Person{
    public static void eat2(){
        System.out.println("Person is eatig");
    }
}

class Animal5{
    public static void main(String args[]){
   
        eat();
        eat1();

  }

}