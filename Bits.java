 // program for clearBit at pos
 class Bits { 
    public static void main(String[]args){ 
        int n=7; //0101 
        int pos=2; 
        int bitMask=1<<pos; 
int newNum=~(bitMask); 
        int finalAns=(newNum & n );
        System.out.println(finalAns); 
           
        }
    } 
