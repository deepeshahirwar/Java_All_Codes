class Encapsulate{ 
    private String Name; 
    private int Roll;// private variables declared 
    private int Age; 
      
   // getter method 
   public String getName() 
   { 
    return Name;
   }  
   public int getRoll() 
   { 
    return Roll;
   } 
   public int getAge() 
   { 
    return Age;
   }  
   //setter method 
   public void setName(String newName) 
   { 
    Name=newName;
   }  
   public void setRoll(int newRoll) 
   { 
    Roll=newRoll;
   } 
   public void  setAge(int newAge) 
   { 
       Age=newAge;
   }     

} 
 
public class Encap3 { 
    public static void main(String []args){ 
        Encapsulate obj=new Encapsulate(); 
         
      // setting values of the variables 
        obj.setName("deepesh"); 
        obj.setRoll(56); 
        obj.setAge(20); 
         
        System.out.println("my name is:"+obj.getName()); 
        System.out.println("my roll is:"+obj.getRoll()); 
        System.out.println("my age is:"+obj.getAge());
    }
}