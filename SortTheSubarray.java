import java.util.*;
 public class SortTheSubarray{ 

    static void sort(){  
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int a[] = new int[n]; 
        int b[] = new int[n]; 
         
        for(int i=0; i<n; i++){ 
            a[i]=sc.nextInt();
        }  
       
        for(int i=0; i<n; i++){ 
             b[i]=sc.nextInt();
     }  
      
     int l =0, r=n-1; 
     while(a[l]==b[l]){ 
       l++;
     } 
     while(a[r]==b[r]){ 
        r--;
      } 
      while(l >0 && b[l] >=  b[l-1]){ 
        l--;
      } 
      while(r < n-1 && b[r] <=  b[r+1]){ 
        r++;
      }
System.out.println((l+1) +" "+ (r+1));      
     
} 

public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in);  
  int tc =sc.nextInt(); 
  while(tc-->0){ 
    sort();
  }
              
}
 
}