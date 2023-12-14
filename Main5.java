/*class Bank2 {
    int getRateOfinterest()
       {
           return 0;
       }
   }
       class Axis extends Bank2{
           int getRateOfinterest()
           {
           //	System.out.println("axis amount is "+3.5);
               return 1000 ;
           }
       }
       
       class Icici extends Bank2{
           int getRateOfinterest()
           { 
       //	System.out.println("icici amount is :" +4.5);
               
               return 1500;
           }
       }
       class Sbi extends Bank2{
           int getRateOfinterest()
           { 
           //System.out.println("sbi amount is :"+5.5);
               
               return 2000;
           }
       }
   public class Main5{
       public static void main(String[] args) {
           Axis obj1=new Axis();
           Icici  obj2=new Icici();
           Sbi obj3=new Sbi();
           System.out.println("axis amount is :"+obj1.getRateOfinterest());
           System.out.println("icici amount is :"+obj2.getRateOfinterest());
           System.out.println("sbi amount is :"+obj3.getRateOfinterest());
               
       }
   } */
  /*  class Bank2 {
     int getRateOfinterest(int a)
       {
           return a;
       }
   }
    class BankA extends Bank2{
           int getRateOfinterest(int a)
           {
           	System.out.println("BankA amount is "+a);
               return a ;
           }
       }
       
        class BankB extends Bank2{
            int getRateOfinterest(int a)
           { 
    	System.out.println("BankB amount is :" +a);
               
               return a;
           }
       }
        class BankC extends Bank2{
            int getRateOfinterest(int a)
           { 
           System.out.println("BankC amount is :"+a);
               
               return a;
           }
       }
   public class Main5{
       public static void main(String[] args) {
        BankA obj1=new BankA();
        BankB  obj2=new BankB();
        BankC obj3=new BankC();
          obj1.getRateOfinterest(1000);
           obj2.getRateOfinterest(1500);
           obj3.getRateOfinterest(2000);
               
       }
   }*/ 
   class Bank2 {
    int printNum(int i)
      { 
        System.out.println("Bank2 amount is "+i);
          return i;
      }
  }
   class Print1 extends Bank2{
          int printNum(int j)
          {
              System.out.println("print1 amount is "+j);
              return j ;
          }
      }
      public class Main5{
        public static void main(String[] args) {
         Bank2 obj1=new Bank2();
         Print1  obj2=new Print1();
        
           obj1.printNum(1000);
            obj2.printNum(1500);
        
                
        }
    } 