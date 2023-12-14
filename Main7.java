class Bank2 {
    float getRateOfinterest()
       {
           return 0.0f;
       }
   }
       class Axis extends Bank2{
           float getRateOfinterest()
           {
           
               return 3.5f ;
           }
       }
       
       class Icici extends Bank2{
           float getRateOfinterest()
           { 
       
               return 4.5f;
           }
       }
       class Sbi extends Bank2{
           float getRateOfinterest()
           { 
            
               return 5.5f;
           }
       } 
       
   public class Main7{
       public static void main(String[] args) { 
           Bank2 obj = new Bank2();
           Axis obj1=new Axis();
           Icici  obj2=new Icici();
           Sbi obj3=new Sbi(); 
           System.out.println("Bank2 amoount is : "+obj.getRateOfinterest());
           System.out.println("Axis amoount is : "+obj1.getRateOfinterest());
           System.out.println("Icici amoount is : "+obj2.getRateOfinterest());
           System.out.println("Sbi amoount is : "+obj3.getRateOfinterest());
               
       }
   }