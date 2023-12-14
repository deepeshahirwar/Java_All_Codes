 //class and objects
 public class Oop1{ 
    public static class Student{ 
        String name; 
        int roll; 
        double cgpa;
    } 
    public static void main(String []args){  
        //create object
        Student s1 = new Student();  
        //set data 
        s1.name = "deepesh"; 
        s1.roll = 56; 
        s1.cgpa = 8.17; 
          

        System.out.println("student name is :"+s1.name);
        System.out.println("student roll is :"+s1.roll);
        System.out.println("student cgpa is :"+s1.cgpa);
 
        Student s2 = new Student();  
        //set data 
        s2.name = "Rahul"; 
        s2.roll = 129; 
        s2.cgpa = 7.83; 
        System.out.println("student name is :"+s2.name);
        System.out.println("student roll is :"+s2.roll);
        System.out.println("student cgpa is :"+s2.cgpa);
 
    }
}