 import java.util.*;//problem 1
 class CountDistinct1{ 
    //find distint element in hashtable 
   /*  public static void main(String[]args){   
    int a[]={3,6,8,4,9,3,2,3,6,};  
    Set<Integer> Set =new HashSet<>(100);         
for(int element : a){ 
 Set.add(element); 
 
}     
System.out.println(Set.size()); 
    }//output 6  distint element is in array
} */
  
//union of two array element
public static void main(String[]args){//problem 2   
    int a[]={5,10,15,5,3,6};  
    int b[]={10,15,4,5};  
    Set<Integer> Set =new HashSet<>(100);         
for(int element : a){//add in hashset 
 Set.add(element); 
}      
for(int element : b){ 
    Set.add(element); 
   } 
    
   for(int i: Set){ 
    System.out.println("hashset element is:"+i+" ");
   }
System.out.println("hashset size is:"+Set.size()); //output 4 (5,10,15,4) is unoin elenment 
}} 
 
