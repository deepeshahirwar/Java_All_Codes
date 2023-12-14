 // copy constructor    
 
 public class Constructers3{ 

    public static void main(String []args){ 
        Boy1 s1 = new Boy1();//1 
        s1.name="deepesh"; 
        s1.roll = 56; 
        s1.marks[0]=100;  
        s1.marks[1]=99; 
        s1.marks[2]=98; 
        

        Boy1 s2 = new Boy1(s1);//copy  
        //update s1.marks[0]; 
        s1.marks[0]=99;  
          
        //for print s2 object 
        for(int i=0; i<3; i++){ 
            System.out.println(s2.marks[i]+" ");
        }
         
       
    }
}  

class Boy1{ 
    String name; 
    int roll;  
     int marks[];

    
    Boy1(Boy1 s1){  
        marks = new int[3]; 

        this.name = s1.name;  
        this.roll = s1.roll;  
        this.marks = s1.marks; 
        System.out.println("copy constructor: ");     
    }  
     
    Boy1(){ 
        marks = new int[3];  
        System.out.println("this is constructor: "); 
    }
 
}