 import java.util.*;
 public class PintuAndFruits{  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
         
        int fr[] = new int[n]; 
        int pr[] = new int[n]; 
         
        for(int i=0; i<n; i++){ 
            fr[i]=sc.nextInt();
        } 
        for(int j=0; j<n; j++){ 
            pr[j]=sc.nextInt();
        } 
        //main operation  
        int freq[] = new int[m+1]; 
        boolean avalible[] = new boolean[m+1]; 

        for(int i=0; i<n; i++){ 
            freq[fr[i]] +=pr[i]; 
            avalible[fr[i]]= true;
        } 
        int min = Integer.MAX_VALUE; 
         
        for(int j =0; j<=m; j++){ 
            if(freq[j] < min &&  avalible[j]==true){ 
                min = freq[j];
            }
        } 
        System.out.println(min);
        
    }

}