 //Strings comperision
 public class String1{ 
    public  static void main(String []args){ 
        String s1 = "tony"; 
        String s2 = "tony"; 
        String s3 = new String("tony"); 
         
       /*  if(s1 == s2){ 
            System.out.println("both String are equal ");
        } 
        else{ 
            System.out.println("both String are  not equal ");
        } 
        //for new keyward
        if(s1 == s3){ 
            System.out.println("both String are equal ");
        } 
        else{ 
            System.out.println("both String are  not equal ");
        }  
         int count =0;
        //cheak  for equal() 
        if(s1.equals(s3)){  
            count++;
            System.out.println("both String are equal : "+count);
        } 
        else{ 
            System.out.println("both String are  not equal ");
        }  */  
         
        //for String itereting
         int count=0;
        for(int i=0; i<s1.length(); i++){ 
            if(s1.equals(s2) && s1.equals(s3) ){ 
                count++;
            } 
            else { 
                count=0;
            } 

        }
        System.out.println(count);  
    }
} 