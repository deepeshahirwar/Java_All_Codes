public   import java.util.*;
class Person{
  int rollNo; 
  String name; 
  int age; 
   
  Student(int rollNo, String name, int age){
      this.rollNo = rollNo; 
      this.name = name; 
      this.age = age;
  }
}
public class ArrayList9 {
  public static void main(String[] args){
      // creating user- defines class object 
       Student s1 = new Person(5, "deepesh", 25); 
        Student s2 = new Person(6, "deepesh", 36);
         Student s3 = new Person(7, "deepesh", 49); 
          
         ArrayList<Student> al = new ArrayList<Person>(); 
          
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

    

