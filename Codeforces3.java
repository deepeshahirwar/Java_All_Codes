import java.util.*;
 
public class Codeforces3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int evoI = str.indexOf("evo");
            int foxI = str.indexOf("fox");
            if (evoI == -1 || foxI == -1) {
                System.out.println("-1"); 
                
            } else if (evoI < foxI) {
                System.out.println("Evo");
            } else {
                System.out.println("Fox");
            }
 }
}
}