public class Constructers1{ 

    public static void main(String []args){ 
Student s1 = new Student("deepesh");//1  
Student s2 = new Student(); //2 
System.out.println(s1.name);//3
    }
}  

class Student{ 
    String name; 
    int roll;  
    //pameteries constructor 
    Student(String name){ 
        this.name = name; 
 System.out.println("student name is :"+name);
    }  
 
    // non - parameteries constructor
    Student(){
System.out.println("i am non - parameteries constructor:");
    }
    


}