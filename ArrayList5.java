 import java.util.*; 
 import java.util.ArrayList;
 public class ArrayList5 {
public static void main(String[]args){  
ArrayList<Integer> list = new ArrayList<>(); 
  
list.add(5);
list.add(10);
list.add(15);
list.add(20); 
 // Tarversing list throught list iterator 
  
 // here, element eterator in reverse order 
  ListIterator<Integer>list1 = list.listIterator(list.size());
   
  while(list1.hasPrevious()) {
     int  num = list1.previous(); 
     System.out.print(num +" ");
  } 
   System.out.println();
   
  // traverse list using for for-each loop 
   
  list.forEach(a->{
    System.out.println(a  +" ");
  }); 
  System.out.println(); 
  // traverse list using for foreach method()
   
  Iterator<Integer>itr = list.iterator(); 
   
  itr.forEachRemaining(a->{
    System.out.println(a  +" ");
  });
System.out.println();
}
}
