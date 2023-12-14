class Sorting{  
    
    public static void main(String[]args){ //selection sort
        int a[]={4,5,7,1,10,45,37,92}; 
        int t;  int i,j;
        for( i=0;i<a.length;i++){  
            for( j=i+1;j<a.length;j++){  
        if(a[i]>a[j]){ 
            t=a[i]; 
            a[i]=a[j]; 
            a[j]=t; 

        } 
        
    }  
    System.out.print(a[i]+" ");
}  
           
         
   
    } 
}