public class BinToDeci{  
   /*  public  static void BinToDec(int binNum){ 
        int myNum = binNum; 
        int pow =  0; 
         
        int decNum =0;
        while(binNum > 0){  

       int lastDigit = binNum % 10; 
       decNum = decNum + (int)(lastDigit * Math.pow(2,pow)); 
        
       pow++; 
       binNum = binNum/10;
        } 
        System.out.println("decimal of "+myNum+" = "+decNum);
    }*/ 
     
public static void  deciToBin(int n){ 
    int pow =0; 
    int BinNum =0;  
    int myNum = n;
     
    while(n > 0){  
        int rem = n%2; 
         
        BinNum = BinNum + (int)(rem * Math.pow(10,pow)); 
        pow++; 
        n = n/2;

    } 
    System.out.println("binary of "+myNum+" = "+BinNum);
}   
    public static void main(String []args){ 
       // BinToDec(101); 
       deciToBin(7);
    }
}