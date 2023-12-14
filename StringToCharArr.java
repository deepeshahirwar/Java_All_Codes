 import java.util.*;
 class StringToCharArr {
    public static void main(String args[])
    {
   /*  String s = "GeeksforGeeks";
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
    }*/ 
  //codechef problem (KOL15A)   
    Scanner sc = new Scanner(System.in); 
	    int t =sc.nextInt(); 
	    int n =sc.nextInt(); 
	    while(t-->0){  
	        String s = sc.next();  
	        char []arr =s.toCharArray();
	        int sum=0;
	        for(int i=0; i<arr.length; i++){  
	            if(arr[i] >= '0' && arr[i] <= '9'){ 
	                sum +=arr[i] -'0';
	            }
	        }
	      System.out.println(sum);  
	    }
    }
    }