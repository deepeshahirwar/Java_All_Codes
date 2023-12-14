public class methodOverri{  
    class A{ 
        public  void show(){ 
            System.out.println(" A show");
        }
    } 
    class B extends A{ 
        public void show(){ 
            System.out.println(" B show");
        }
    }
    public static void main(String[] args) {
        A obj = new A(); 
        obj.show();
    }
    
}
