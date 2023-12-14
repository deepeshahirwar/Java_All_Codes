 import java.util.*;
 public class Sum {
public static  void main(String []args){ 
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter first number "); 
    int a = sc.nextInt();  
    System.out.println("enter second number "); 
    int b = sc.nextInt(); 
     
    int sum = a+b; 
System.out.println("your sum is : "+sum); 
//control statemet   
//which number is greater b/w a and b
if(a>b){ 
    System.out.println("a is greater : "+ a); 
} 
else { 
    System.out.println("b is greater : "+ b);   
}

} 

}