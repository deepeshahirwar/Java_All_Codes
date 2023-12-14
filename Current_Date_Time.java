 import java.time.LocalTime;  
 import java.time.LocalDate; 
 import java.time.LocalDateTime; 

 public class Current_Date_Time {
    public static void main(String[] args) { 
        //for print current date
        LocalTime time = LocalTime.now(); 
        System.out.println("current time is :"+time);  
         
        //for print current date 
        LocalDate date = LocalDate.now(); 
        System.out.println("current date is :"+date); 
         
        //for print current date and time 
         
        LocalDateTime datetime =LocalDateTime.now(); 
        System.out.println("current date and time :"+datetime);
    }
}
