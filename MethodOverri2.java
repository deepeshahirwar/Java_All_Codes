 //method Overriding 

 class A{ 
    public  void show(){ 
        System.out.println(" A show");
    }
} 
class B extends A {
     public void show(){ 
         System.out.println(" B show");
     }
} 
 

 public class MethodOverri2 { 
      
        public static void main(String[] args) {
              B c = new B(); 
              c.show(); 
              
            
            
        }
        
    }
    

