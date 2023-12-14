import java.util.*; 
import java.lang.String; 

class findWordInStr{

public static void main(String[]arg){  

String s1="i not have ay facy ques"; 
String s2 =" not ";  
char []arr1 =s1.toCharArray(); 
char []arr2 =s2.toCharArray(); 
 
HashSet<Integer> set = new HashSet<>(); 
   
for(int i :arr1){//for a1 adding element 
    set.add(i);
}
for(int j :arr2){ 
    if(set.contains(" not ")){ 
  System.out.println("yes"); 
  break;
    } 
    else{ 
      System.out.println("no"); 
      break;
    }
}  

  
}
}