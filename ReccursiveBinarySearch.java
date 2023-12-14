public class ReccursiveBinarySearch{ 
    public int getTarget(int a[], int s, int e,int target,int n){ 
      s = 0; 
      e = n-1;  
       //base case 
      if(s == e) 
      { 
         if(s == target){ 
             return s;
         } 
         else { 
             return 0;
         }  
     }
          
         else { 
             int mid = (s+e)/2; 
             if(a[mid]== target){ 
                 return mid;
             } 
             else if(a[mid] > target){ 
             return getTarget(a,s,mid-1, target ,n);
             } 
             else {  
                 return getTarget(a,mid+1,e, target ,n);
             }
         }
       
 
     } 
     public static void main(String []args){ 
     int a[] = { 11,32,41,54,62,72};  
     int  n =  a.length;
     int target = 11;
     int s = 0;
  
     ReccursiveBinarySearch obj = new ReccursiveBinarySearch(); 
   int ans =   obj.getTarget(a,s, n-1, target, n); 
    
   System.out.println(ans);
     }
 }