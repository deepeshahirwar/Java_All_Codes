//function ovverloading 
 public class Overloading1{  
   static int sum(int a,int b){ 
        return a+b;
    } 
  static  int sum(int a,int b,int c){ 
        return a+b+c;
    } 
   static float sum(float a, float b){ 
        return a+b;
    }
    public static void  main(String[]args){ 
//create object 
//Overloading obj = new Overloading(); 
System.out.println(sum(2,3)); 
System.out.println(sum(1,2,3)); 
System.out.println(sum(2.5f,3.5f));
    }
 }