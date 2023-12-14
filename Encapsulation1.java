public class Encapsulation1{  
    private int age;  
    private String name;  
    private int roll;

    //get method 
    public   int getAge(){ 
        return age;
    }  
    //setter method
    public  void  setAge(int age){  
        this.age = age;

    } 
    //getter method 
    public String getName(){ 
    return name;
  } 
   public void setName(String Name ){ 
    this.name = Name;
  } 

   public int getRoll(){ 
    return roll;
   }  
   public void setRoll(int Roll){ 
    this.roll = Roll;
   }
    public static void main(String []args){
       Encapsulation1  obj= new Encapsulation1();  
       obj.setAge(20);//set age; 
       obj.setName("deepesh"); 
       obj.setRoll(20);
        System.out.println(" my age is :"+obj.getAge());//get age
        System.out.println(" my name is :"+obj.getName()); 
        System.out.println(" my roll no. is :"+obj.getRoll());
    }
}