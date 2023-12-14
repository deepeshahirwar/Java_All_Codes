 import java.util.*;
 public class CheakBalance{ 
    public static void main(String []args){  
        Scanner sc= new Scanner(System.in);  
        String name1 ="deepesh"; 
        long passward1 = 12345;  
        double amountBalance = 100000.5; 

        System.out.println("please enter user name : ");
        String name2 = sc.next();  
         
        System.out.println("please enter user pasward : ");
        long passward2 = sc.nextLong(); 
          
        //for cheaking  user passward and name.
        if(name1.equals(name2) && passward1 == passward2){  
          System.out.println("your amountBalance is : "+amountBalance);
        } 
        else { 
            System.out.println("Invalid user name or pasward ");  
            System.out.println(" please try again "); 

        }

    }
}