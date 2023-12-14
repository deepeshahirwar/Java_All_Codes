 import java.util.*;
 class PatternOne1{ 
    public static void main(String[]args){ 
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();//for row  
        int m=sc.nextInt();//for column 
        for(int i=1; i<=n; i++){ 
            for(int j=1; j<=m; j++){ //
                System.out.print("*"+" "); //Scanner sc=new Scanner(System.in);

            } 
            System.out.println();
        }
    }
}