//polymorphism 
//comppile time polymorphism 
// method overloading 
 
/*method name same but deffirent parameter*/
public class Polymorphism{  
    static int add(int a,int b){ 
        return a+b;
    }  
    static int add(int a,int b, int c){ 
        return a+b+c;
    } 

    public static void main(String[] args) {
        System.out.println(add(2,4)); 
        System.out.println( add(2,4,6));
    }
}