class Name {
 
    private int age; // Private is using to hide the data
 
    public int getAge()  
    {  
        return age; 
     } // getter
 
    public void setAge(int age)
    {
        this.age = age;
    } // setter
}
 
class Encap2 {
    public static void main(String[] args)
    {
 
        Name n1 = new Name();//create object
 
        n1.setAge(20);//set  value 
 
        System.out.println("The age of the person is: "
                           + n1.getAge());
    }
}