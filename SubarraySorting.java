import java.util.*;
public class SubarraySorting {   
   // int ans[] = new int[];
    static void sort(int a[], int l1, int r1,int n){  
        for(int i=0; i<l1; i++){ 
            ans[i] = a[i];
        }
        for (int i = l1; i <=r1; i++) {
            for (int j = i + 1; j <=r1; j++) {
 
                int temp = 0;
                if (a[i] > a[j]) {
                    // Swapping
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }  
       ans[i]= a[i];
    }  

} 
int ans[] = new int[];
    public static void main(String[] args) { 
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
    // sort(a,2,4,5); 
      
     int l1 =0,r1=n-1; 
    // int l2 =0, r2 = n-1;  
     while(l1 < r1 && l2 < r2){ 
        if(a[l1]==b[l1] && a[r1]==b[r1]){ 
            l1++; 
            r1--;
        } 
        else if(a[l1]!=b[l1] && a[r1]!=b[r1] ||a[l1]==b[l1] && a[r1]!=b[r1] || a[l1]!=b[l1] && a[r1]==b[r1]){ 
            sort(a,l1,r1,n);
        }
     } 
    
      int cnt =0;
for(int j =0; j<n; j++){ 
    if(ans[j]==b[j])
    cnt++;
} 
if(cnt== n) 
System.out.println("yes"); 
else 
System.out.println("no");
         
       
    }
    
}
