class Account { 
//private data members to hide the data 
 private long acc_no; 
 private String name; 
 private String email; 
 private float amount; 
   
 //public getter and setter methods  
  
 public long getAcc_no(){//getter1 
    return acc_no;
 } 
 public void setAcc_no(long acc_no){//setter1 
    this.acc_no=acc_no;
 } 
 public String getName(){//getter 2 
    return name;
 } 
 public void setName(String name){//setter2 
    this.name=name;
 } 
 public String getEmail(){//getter3 
    return email;
 } 
 public void setEmail(String email){//setter3 
    this.email=email;
 } 
 public float getAmount(){//getter4 
    return amount ;
 } 
 public void setAmount(float amount){//setter4 
    this.amount=amount;
 }
} 
 
public class Encap4{ 
    public static void main(String[]args){ 
        Account obj=new Account(); 
        
        //for set values 
        obj.setAcc_no(1528493); 
        obj.setName("deepesh"); 
        obj.setEmail("deepesh12345@gmail.com"); 
        obj.setAmount(100000000f); 
        //for get values  
        System.out.println( obj.getAcc_no());
        System.out.println( obj.getName());
        System.out.println( obj.getEmail());
        System.out.println( obj.getAmount());
    }
}