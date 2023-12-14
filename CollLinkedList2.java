 import java.util.LinkedList;
 public class CollLinkedList2 {  
    public static void main(String[] args) {
    //creation of linkedList  
   LinkedList<String> lang = new LinkedList<>();  

// ->Method of  java LinkedList 
// 1. add elemt 
// 2. Access element 
// 3.Change element  
// 4. remove element 
 
// add() method without the index parameter
lang.add("c"); 
lang.add("c++");
lang.add("java"); 
lang.add("python"); 
 
System.out.println(lang); 
// add() method with the index parameter  
lang.add(1,"html"); 

lang.addFirst("js");  
lang.addLast("c#");
System.out.println(lang); 

int size = lang.size(); 
System.out.println("size is : "+size); 
 
//Access element
  String s5 =lang.get(5);  
  System.out.println(s5); 
   
  //change element 
  lang.set(0,"Ruby"); 
  System.out.println("changed List : "+lang); 
   
  //remove element 
 String removed = lang.remove(3); 
  System.out.println(lang); 
 System.out.println("index 3 element are removed :"+removed); 
  
 String first =lang.removeFirst();  
String last = lang.removeLast();  
System.out.println(lang); 
 
System.out.println("first removed elememt is :"+ first); 
System.out.println("last element  is : "+ last); 
 
//iteration 
System.out.println("linkedlist elemment are :"); 
for(String i : lang){ 
    System.out.print(i+",");
} 
// 
for(int i =0; i<lang.size(); i++){ 
    System.out.println(lang.get(i)+" ");
} 

    }   
}
