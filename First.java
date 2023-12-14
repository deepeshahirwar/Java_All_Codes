
 
class A{ 
    int i; 

} 
class B extends A 
{ 
    int j; 
    void display() 
    { 
        super.i=j+i; 
        System.out.println(j+" "+i); 
    } 
} 
class inheritance 
{ 
    public static void main(String args[]) 
    { 
        B obj=new B(); 
        obj.i=1; 
        obj.j=2; 
        obj.display(); 
    } 
}
        

    
    
