
  public class Oop2{  
    public static  class Student{ 
        String name; 
        int rolln; 
        double percent;
    }
    public static void change(Student s){ 
      s.name ="deepesh"; 
      s.rolln = 56;
    }
 public static void main(String []args){   

Student s1 = new Student(); 
s1.name =" Ram"; 
s1.rolln = 108; 
s1.percent = 99.9;  

 // clas is pass by reference 
 //vales uptade
System.out.println(s1.name); 
change(s1); 
System.out.println(s1.name);  
change(s1); 
System.out.println(s1.rolln);  
 }
 }