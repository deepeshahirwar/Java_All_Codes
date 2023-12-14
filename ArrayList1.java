 import java.util.ArrayList;
 public class ArrayList1{ 
    public static void main(String []args){  

        ArrayList<Integer> arr = new  ArrayList<>(); 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
         
        int n = arr.size();  
        arr.set(0,9); 
    

        System.out.println(arr.size());
        for(int i=0; i<n; i++){ 
            System.out.println(arr.get(i)+" ");
            
        } 
        //System.out.println();(sout) 
       // public static void main(String[] args) {(main)
            
        }
    }

