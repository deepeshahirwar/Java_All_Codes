class Sorting1{ 
    public static void main(String[]args){ 
       int a[]={10,6,3,8,9}; 
       int t; 
       for(int i=0;i<a.length;i++){ 
        int min=i;  
for(int j=i+1;j<a.length;j++){ 
     
    if(a[j]<a[min]){ 
min=j; 
 
    } 
    if(min!=i){ 
        t=a[i]; 
a[i]=a[min]; 
a[min]=t;   
    }  
       }  
       System.out.print(a[i]+" ");   
    } 
    //System.out.print(a[i]+" ");
} 
}