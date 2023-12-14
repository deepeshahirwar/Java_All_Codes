public class Jump_Stayers {  
  static int  coutNoOfWay(int n){ 
    if( n<0){
        return 0;
    } 
    if(n==0){
        return 1;
    }
 
    return coutNoOfWay(n-1)+coutNoOfWay(n-2)+coutNoOfWay(n-3);
    }
    public static void main(String[] args) {
        int n =4; 
System.out.println("no.of jump -> "+coutNoOfWay(n));
    }
    
}
