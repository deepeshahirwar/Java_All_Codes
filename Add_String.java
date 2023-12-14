public class Add_String { 
    public static void main(String[] args) { 
        String s1 ="11"; 
        String s2 ="123"; 
        //output -> "134" 
        StringBuilder sb = new StringBuilder(); 
        sb.append(s2+s1); 
        System.out.println(sb);
        
    }
    
}
