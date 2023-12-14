 //constructor overloading   
 //eg -> runtime  polymorphism
 public class Constructers2{ 

    public static void main(String []args){ 
        Boy s1 = new Boy("deepesh");//1  
        Boy s2 = new Boy("deepesh",56); //2 

    }
}  

class Boy{ 
    String name; 
    int roll;  
    
    Boy(String name){ 
        this.name = name; 
   System.out.println("student name is :"+name);
    }  
 

    Boy(String name, int roll){ 
     this.name = name ; 
     this.roll= roll; 
     System.out.println(name+" : "+roll);

    }
    


}