public class Person{ 
    private String name; 
     //getter
    public String getName(){ 
        return name;
    } 
    //setter 
    public  void setName(String newName) 
    { 
        this.name=newName;
    }
} 
public class Encapsulation { 
    public  static void main(String [] args){ 
        Person obj=new Person(); 
        obj.setName("deepesh"); 
        System.out.println( obj.getName());
    } 
}