import java.io.IOException;
import java.util.Scanner;
 public class ShutDown { 
    public static void main(String[] args) throws IOException {

        Runtime run = Runtime.getRuntime(); 
        try{ 
            run.exec("shutdown /r /t 0 ");
        } 
        catch(IOException e){ 
            e.printStackTrace();
        }
       
    }

}
