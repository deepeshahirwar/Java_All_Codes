
import java.util.*; 
  
public class ArrayList4{
public static void main(String[]args){  
    Scanner sc = new Scanner(System.in);
    //creating a arraylist 
//ArrayList<Integer> arr = new ArrayList<>();  
ArrayList7<String> arr = new ArrayList7<>(); 
int size = sc.nextInt();   

 for(int i=0; i<size; i++){ 
    arr.add(sc.next());
 }

 
// System.out.println("enter arraylist size :");
// int size = sc.nextInt();  
 
// System.out.println("enter arraylist element : ");
// for(int i=0; i<size; i++){ 
//     arr.add(sc.nextInt());
// }
 
for(int i  =0; i<arr.size(); i++){ 
    System.out.print(arr.get(i)+" "); 
 } 
   
 System.out.println(" reverse String is : ");
 for(int i  = size-1 ; i>=0; i--){ 
    System.out.print(arr.get(i)+" "); 
 }

} 
}