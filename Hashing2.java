import java.util.*; 
class   Hashing2{ //find different element in two array
     /* public static int union(int a[],int b[]){ 
        HashSet<Integer> set = new HashSet<>(); 
        for(int i :a){ 
            set.add(i);
        }
        for(int j :b){ 
            set.add(j);
        } 
        return set.size();
    } 
    public static void main(String[]arg){ 
        int a[]={7,9,1}; 
        int b[] ={5,3,9,7,1}; 
        System.out.println(union(a,b));  
         
        for(int i:a){//for print set element  
            System.out.println(i);
        }
    } 
}*/
         
         
        public static int intersectoin(int a[],int b[]){ 
            HashSet<Integer> set = new HashSet<>(); 
            int count=0; 
            for(int i :a){//for a1 adding element 
                set.add(i);
            }
            for(int j :b){ 
                if(set.contains(j)){ 
                  count++; 
                  System.out.print(j+" "); 
                  set.remove(j);//for commun elment remove
                }
            } 
            return count;
        } 
        public static void main(String[]arg){ 
            int a[]={7,9,1}; 
            int b[] ={5,3,9,7,1}; 
            System.out.println(" is intersectoin element and count is:  "+intersectoin(a,b));
    }
}