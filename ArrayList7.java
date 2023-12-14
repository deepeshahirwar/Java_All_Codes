  import java.util.*;
  class Student{
    int rollNo; 
    String name; 
    int age; 
     
    Student(int rollNo, String name, int age){
        this.rollNo = rollNo; 
        this.name = name; 
        this.age = age;
    }
 }
 public class ArrayList7 {
    public static void main(String[] args) {
         
        // creating user- defines class object 
         Student s1 = new Student(5, "deepesh", 25); 
          Student s2 = new Student(6, "deepesh", 36);
           Student s3 = new Student(7, "deepesh", 49); 
            
           ArrayList<Student> al = new ArrayList<Student>(); 
            
           al.add(s1);// add objects in arraylist
            al.add(s2);
             al.add(s3); 
              
             //geting iterator 
              
             Iterator itr = al.iterator(); 
              
             while (itr.hasNext()) {
                Student st = (Student)itr.next(); 
                System.out.println(st.rollNo +" "+ st.name +" "+ st.age);
             }
    }
}
