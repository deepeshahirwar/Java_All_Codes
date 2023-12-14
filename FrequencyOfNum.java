 import java.util.Scanner;
  class Frequency{ 
    int a[] = new int[10]; 
    int key;  
    int n;

    int getData(){ 
        Scanner sc = new Scanner(System.in); 

       System.out.println("enter array size : ");
         n = sc.nextInt(); 

        System.out.println("enter array element : "); 
        for(int i = 0; i<n; i++){  
            
            a[i]= sc.nextInt();
        }  
        System.out.println("enter your searching num : ");
        key =sc.nextInt(); 
         
        return 0;
    } 
     
    int findFreq(){ 
    int cnt = 0;  
    for(int i=0; i<n; i++){ 
        if(a[i]== key){ 
            cnt++;
        }
    }  
    System.out.println("frequecy of "+key +" is: "+cnt);  

    return 0; 
    } 
     
} 
public class FrequencyOfNum{ 
    public static void main(String[] args) {
        Frequency obj  = new Frequency(); 
        obj.getData(); 
       obj.findFreq();  
        
    }
}