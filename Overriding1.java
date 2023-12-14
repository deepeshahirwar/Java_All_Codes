 // create super class 
 class Bank{ 
    int getRateOfInterest(){ 
        return 10;
    }
} 
//create multiple child class 
class Sbi extends Bank{ 
    int getRateOfInterest(){ 
        return 7;
    }
}  
class Icici extends Bank{ 
    int getRateOfInterest(){ 
        return 8;
    }
}  
class Axis extends Bank{ 
    int getRateOfInterest(){ 
        return 9;
    }
} 
public class Overriding1{ 
    public static void main(String[]args){ 
// create intance of  all child class 
Sbi s = new Sbi(); 
Icici i= new Icici(); 
Axis a = new Axis(); 
 
System.out.println(s.getRateOfInterest()); 
System.out.println(i.getRateOfInterest());
System.out.println(a.getRateOfInterest());
    }
}