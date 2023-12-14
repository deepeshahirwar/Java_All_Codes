 class Calculator{  
     
    public int Sum(int a , int b){  
        System.out.println("sum is :"); 
        int r = a+b; 
        return r;
    }  
}
      
  /*   public int multiply(int a,int b){ 
        System.out.println("multiply is "+(a*b)); 
        return 0;
    

 }*/
 public class BasicJava{ 
    public static void main (String args[]){ 
       int num1 =4; 
       int num2 = 5; 

        //creating object 
         Calculator obj = new Calculator(); 
         int ans = obj.Sum(num1,num2); 
        // obj.multiply(5,5); 
        System.out.println(ans);
        
    }
}