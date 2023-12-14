import java.util.*;
public class BasicJava2 { 
    
    public static void main(String[]args){ 
        int n=5; 
        int i,j; 
         
        
        //outer loop
        for(i=n;i>=1;i--){ 
             //inner loop
        for(j=1;j<=i;j++){ 
        // cell>(i,j)  
        int sum=i+j; 
        if(sum%2==0)  
        { 
            System.out.print(1);  
        } 
        else { 
            System.out.print(0); 
        }

                    System.out.print(" ");  
                }
                System.out.println(); 
            }
         
        }
             
    } 


          
        
    
        


    

