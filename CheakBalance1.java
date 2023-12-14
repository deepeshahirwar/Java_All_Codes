import java.util.*;
 public class CheakBalance1{ 
    public static void main(String []args){  

        Scanner sc= new Scanner(System.in);  
        System.out.println("please write a user name : ");
        String name1 = sc.next();  
         
        System.out.println("please set user 4 digit passward : ");
        long passward1 = sc.nextLong(); 
           
        
     
        double acountBalance = 1000000.5; 

        System.out.println("conform user name : ");
        String name2 = sc.next();  
         
        System.out.println("conform user passward : ");
        long passward2 = sc.nextLong(); 
          
        //for cheaking  user passward and name.
        if(name1.equals(name2) && passward1 == passward2){ 

         System.out.println("for cheak bank balance enter user name again : ");
        String name3 = sc.next();  
         
        System.out.println("enter user pasward : ");
        long passward3 = sc.nextLong(); 
            
        if(name2.equals(name3) && passward2 == passward3){ 
          System.out.println("your Bank Balance is : "+acountBalance); 
          System.out.println("THANKYOU DEAR COSTUMER : "); 

        } 

        } 
        else { 
            System.out.println("Invalid user name or pasward ");  
            System.out.println(" please try again "); 

        }

    }
}