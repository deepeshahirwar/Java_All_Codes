 import java.util.ArrayList; 
 import java.util.List;
 public class CollArraylist {  
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(); 
        list.add(0, null); 
        list.add(5);  
        list.add(10);  
        list.add(15); 
        list.add(20);  
         
        System.out.println(list); 
         
        list.remove(1);
         
        list.add(1,100);
        System.out.println(list);  
         
        int n1 = list.get(1); 
        System.out.println(n1); 
         
        for(int i=0; i<list.size(); i++){ 
            System.out.print(list.get(i)+" ");
        }  
        System.out.println();
         
        List<Integer>list2 = new ArrayList<>(1); 
        list2.add(3); 
        list2.add(4); 
         
        System.out.println(list2); 
         
        list.addAll(list2); 
         
        System.out.println(list); 
        
         


    }  
}
 
