public class TOH{  
    public static void diskMover(String from, String to, String  spare, int n){  
        //base case
        if(n==0){ 
            return;
        }  
        diskMover(from , spare, to, n-1);   

        System.out.print("move disk "+ n +"from  "+from+" to  "+to);

       diskMover(spare, to, from,  n-1); 
    }
    public static  void main(String [] arg){  
        
         
        diskMover("bhopal"," indore" ,"ujjain", 3);
    }
}