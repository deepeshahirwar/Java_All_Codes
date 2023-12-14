class PrintNumber{ 
    int print(int a){ 
        System.out.println("int num is :"+2); 
        return a;
    }

float print(float b){ 
    System.out.println("float num is :"+b); 
    return b;
} 
double print(double c){ 
    System.out.println("double num is :"+c); 
    return c;
} 
}
class Main6{ 
    public static void main(String[]args){ 
        PrintNumber obj9=new PrintNumber();  
        obj9.print(10); 
        obj9.print(10.511111111111f); 
        obj9.print(10.555555555555555555555555555555555555); 
    
    }
}