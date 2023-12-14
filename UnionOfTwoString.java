  import java.util.*; 
  import java.lang.String; 

  class UnionOfTwoString{
 public static int intersectoin(char arr1[],char arr2[]){ 
    HashSet<Integer> set = new HashSet<>(); 
    int count=0; 
    for(int i :arr1){//for a1 adding element 
        set.add(i);
    }
    for(int j :arr2){ 
        if(set.contains(j)){ 
          count++;
        }
    } 
       
    return count;
} 
public static void main(String[]arg){ 
String s1="abc"; 
String s2 ="abcDE";  
char []arr1 =s1.toCharArray(); 
char []arr2 =s2.toCharArray();
    System.out.println("commun charater in both Strings is "+intersectoin(arr1,arr2));
}
}