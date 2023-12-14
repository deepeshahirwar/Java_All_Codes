 import java.util.*;
 class BoubleSort{ 
    public static void main(String[]args){ 
     Scanner sc=new Scanner(System.in);  

     System.out.println("enter  array size : ");
     int size=sc.nextInt(); 
       int a[]= new int[size]; 
       //for array input   
       System.out.println("enter array element");
       for(int i=0;i<a.length;i++){  
          a[i]=sc.nextInt();
       }
         
        for(int i=0;i<a.length;i++){ 
         for(int j=i+1;j<a.length;j++){ 
               
         if(a[i]>a[j]){ 
         int t=a[i]; 
          a[i]=a[j]; 
           a[j]=t; 
  
          }   
           
            }  
            System.out.print(a[i]+" "); 
            //System.out.println(); 
         
            } 
             
            
    }
}