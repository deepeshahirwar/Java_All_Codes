 import java.util.*;
 class Calculater{ 
    public static void main(String[]args){  
        Scanner sc=new Scanner(System.in); 
         
        System.out.println("enter first num :");
        int a=sc.nextInt(); 
        System.out.println("select symbol (+,-,*,/):");  
        String sym=sc.next();   
        System.out.println("enter second num :");
        int b=sc.nextInt();   
        int result;
        switch(sym){
            case "+":result=a+b; 
            System.out.println(" additon is "+result); 
            break; 
            case "-":result=a-b; 
            System.out.println("sub is "+result);  
            break;
            case "*":result=a*b; 
            System.out.println("mul is  "+result);  
            break;
            case "/": result=a/b;
            System.out.println("dividion is  "+result); 
            break; 
            default : 
            System.out.println("invalid symbol :"); 
        } 
         
        
        
    }
}