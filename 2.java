class Bank2 {
    float getRateOfinterest()
       {
           return 0.0f;
       }
   }
       class Axis extends Bank2{
           float getRateOfinterest()
           {
           //	System.out.println("axis amount is "+3.5);
               return 3.5f ;
           }
       }
       
       class Icici extends Bank2{
           float getRateOfinterest()
           { 
       //	System.out.println("icici amount is :" +4.5);
               
               return 4.5f;
           }
       }
       class Sbi extends Bank2{
           float getRateOfinterest()
           { 
           //System.out.println("sbi amount is :"+5.5);
               
               return 5.5f;
           }
       }
   public class Main3 {
       public static void main(String[] args) {
           Axis obj1=new Axis();
           Icici  obj2=new Icici();
           Sbi obj3=new Sbi();
           System.out.println(obj1.getRateOfinterest());
           System.out.println(obj2.getRateOfinterest());
           System.out.println(obj3.getRateOfinterest());
               
       }
   }