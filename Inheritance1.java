class Circle{ 
    float getAreaC(float r){ 
        return r*r*3.14f;
    } 
      
}   
class Square extends Circle{ 
    int getAreaS(int s){ 
        return s*s;
    }      
}  

public class Inheritance1{
public static void main(String[]args){  
    //create object
Square s1 = new Square(); 
System.out.println("squar area is : "+s1.getAreaS(12)); 
System.out.println("circle area is : "+s1.getAreaC(7f));
} 
}