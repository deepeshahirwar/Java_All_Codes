 
 //multi level intharitance 
 //base class 
 class Shape{ 
    int area(){
        System.out.println("shape area is : "); 
        return 0;
    }
 } 
 //derived class 1 
 class Square extends Shape{ 
    int area(int a){ 
     return a*a;
    }
 } 
 //derived class 2
 class Rectengle extends Square{ 
    int area(int a,int b){ 
        return a*b;
    }
 }
 public class MultilevelInheritance{ 
    public static void main(String[] args) {
        Rectengle obj = new Rectengle ();  

       System.out.println(obj.area()); 
       System.out.println(obj.area(5)); 
       System.out.println(obj.area(5,10));
    } 

}