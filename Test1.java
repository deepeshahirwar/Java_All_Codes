import java .io.FileInputStream; 
class Test1 { 
    public static void main(String[]as){  

        try{
        FileInputStream f = new FileInputStream("d:/abc.txt"); 
        } 
        catch(Exception e){ 
            System.out.println(e);
        } 
        finally{ 
            System.out.println(" hi");
        } 

        } 
    }
 
//exception ->FileNotFoundException 