 import java.util.*;
 class Array6{ 
    public static void main(String[]args){  

Scanner sc=new Scanner(System.in); 

System.out.println("enter size of array"); 
int num=sc.nextInt(); 
int [] arr=new int[num]; 
System.out.println("enter array of values");  

for(int i=0;i<arr.length;i++){ 
    arr[i]=sc.nextInt(); 
    
}  
System.out.print("array element is : "); 
for(int i=0; i<num; i++){ 
System.out.print(arr[i]+" "); 
} 

System.out.println(); 
    }
}