class Bank{ 
    float getBalance(){ 
        return 0.0f;
    } 
} 

class Axis extends Bank{ 
    float getBalance(){ 
        
        return 2.5f;
    }
} 
class Icici extends Bank{ 
    float getBalance(){ 
     
        return 3.5f;
    }
} 

class Sbi extends Bank{ 
    float getBalance(){ 
       
        return 4.5f;
    }
} 
 
 class MainA{  
    public static void main(String[]args){
    Axis obj1=new Axis(); 
    Icici obj2=new Icici(); 
    Sbi obj3=new Sbi();  

    System.out.println("Axis bank amount is : "+obj1.getBalance());
    System.out.println("icici bank amount is : "+obj2.getBalance()); 
    System.out.println("sbi bank amount is : "+obj3.getBalance()); 
   
} 
}  
/*class Bank{ 
    int  getBalance(){ 
        return 0;
    } 
} 

class BankA extends Bank{ 
    int getBalance(){ 
       // System.out.println("first amount is :"+a); 
        return 1000;
    }
} 
class BankB extends Bank{ 
    int getBalance(){ 
       // System.out.println("second amount is :"+a); 
        return 1500;
    }
} 

class BankC extends Bank{ 
    int getBalance(){ 
       //nt is :"+a);  System.out.println("third amou
        return 2000;
    }
} 
 
 class MainA{  
    public static void main(String[]args){ 
        Bank obj=new Bank();
    BankA obj1=new  BankA (); 
    BankB  obj2=new  BankB (); 
    BankC  obj3=new  BankC(); 
    System.out.println(" bank amount is ="+obj.getBalance());  
System.out.println(" bankA amount is ="+obj1.getBalance());
   // obj1.getBalance(1000); 
     
    System.out.println(" bankB amount is ="+obj2.getBalance()); 
    //obj2.getBalance(1500);  
    System.out.println(" bankC amount is ="+obj3.getBalance()); 
   // obj3.getBalance(2000);
} 
}*/