import java .io.FileInputStream; 
class Test { 
    public static void main(String[]as){  

        try{
        FileInputStream f = new FileInputStream("d:/abc.txt"); 
        } 
        catch(Excetoin e){ 
            System.out.println(e);
        } 
        finally{ 
            System.out.println(" hi");
        } 

        } 
    }
 
//exception ->FileNotFoundException