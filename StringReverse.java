class StringReverse{ 
     public static void main(String[]args){ 
       /*  String s="tit"; 
        String rev=""; 
        for(int i=s.length()-1;i>=0;i--){ 
            //s[i]=sc.next(); 

            rev=rev+s.charAt(i);
        }  
        if(s.equals(rev)) //equals function
        System.out.print("string is pelendrom:"); 
        else 
        System.out.print("string is not pelendrom:"); 
         */  
        //array sort;
        int a[]={5,4,3,4,1}; 
        for(int i=0; i<a.length; i++){ 
            java.util.Arrays.sort(a); 
            System.out.print(a[i]+" ");
  
        } 
    
    }
}