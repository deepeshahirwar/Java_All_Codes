 class Bank{ 
   public static int  getBalance(){ 
        return 0;
    } 
} 

 class BankA extends Bank{ 
    public static  int getBalance(){ 
       
        return 1000;
    }
} 
  class BankB extends Bank{ 
    public static int getBalance(){ 
      
        return 1500;
    }
} 

 class BankC extends Bank{ 
    public static  int getBalance(){ 
       
        return 2000;
    }
} 
 
 public class MainC{  
    public static void main(String[]args){ 
     Bank obj=new Bank();     
    BankA obj1=new  BankA (); 
    BankB  obj2=new  BankB (); 
    BankC  obj3=new  BankC();  

    System.out.println(" bank amount is ="+obj.getBalance());  
    System.out.println(" bankA amount is ="+obj1.getBalance()); 
    System.out.println(" bankB amount is ="+obj2.getBalance()); 
    System.out.println(" bankC amount is ="+obj3.getBalance()); 
   
  
} 
}