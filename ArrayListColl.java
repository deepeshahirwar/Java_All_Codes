 import java.util.ArrayList;
 public class ArrayListColl { 
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(4);  
        list.add(5); 
        list.add(6);  
        list.add(7);  
        list.add(8);  
         
        System.out.println(list);
         
        int ans1 =list.get(1); 
        System.out.println(ans1); 
        //int ans2 =list.get(7);   
        //Exception in thread "main" 
        // java.lang.IndexOutOfBoundsException:  
        //Index 7 out of bounds for length 5 
         
        int ans3 = list.get(3); 
        System.out.println(ans3);   
         


        // for print all element of list
        for(int i : list){ 
            System.out.print(i+" ");
        } 
        System.out.println();  

        for(int j=0; j<list.size(); j++){ 
            System.out.print(list.get(j)+" ");
        }   

        System.out.println();
        System.out.println("for string array list : "); 
         
        //for String ArrayList
        ArrayList<String> list2 = new ArrayList<>();  
        list2.add("Deepesh");  
        list2.add("Ahirwar");  
        list2.add("Awad");  
        list2.add("Surekha");  
         
        String s1 = list2.get(0); 
        System.out.println(s1); 
         
        String s2 = list2.get(3); 
        System.out.println(s2);
          
        System.out.println(list2); 
         
        for(String str : list2){ 
            System.out.println(str+" ");
        } 
         
        //string to array
        String str2 = "bhopal"; 
        char[] arr1 =str2.toCharArray(); 

        System.out.println(arr1[0]); 
        System.out.println(arr1);



        
    }
    
}
