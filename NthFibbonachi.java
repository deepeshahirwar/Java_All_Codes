 import java.util.Scanner;
 public class NthFibbonachi { 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int f1=0,f2=1;  
       System.out.print(f1+" "+f2+" ");  
        for(int i=2; i<n; i++){ 
            int next = f1+ f2; 
            f1 = f2; 
            f2 = next; 
            System.out.print(f2+" ");
        }

        
    }
    
}
