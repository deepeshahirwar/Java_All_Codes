 //import java.util.*;
 class Second{ 
    public static void main(String []args){ 
int a[]={4,6,2,8,9,5,1}; 
 int temp;
 
for(int i=0;i<a.length;i++){ 
    for(int j=i+1;j<a.length;j++){  
    if(a[i]>a[j]){ 
temp=a[i]; //swaping
a[i]=a[j]; 
a[j]=temp;
    }   
} 
}
System.out.println("second largest num is :"+a[1]);

    }
}