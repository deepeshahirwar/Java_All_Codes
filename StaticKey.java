public class StaticKey{  
     //int a=40; 
     /*error: non-static variable a cannot be referenced from a static context
                           System.out.println(a);*/ 
     static int a=29; 
     //int getData(){ 
       // System.out.println(" i am data : ");
    // }   
    public static void getData2(){ 
        System.out.println("i am data2 : ");
    }                    
    public  static void main(String[]args){  
      // System.out.println( getData());they will give error becuase you not use static keyward
    getData2();//firstly print getData 
     System.out.println(a); //secondly print a
     
    }
} 