class Maths{ 
    public static void main(String[]args){ 
         int  x=1000; 
        int y=1; 
        int a=4; 
        int b=29;  

       double z=Math.abs(y-x); 

        System.out.println(z); 

         int arr[]={3,5,8,2,1};  

        for(int i=0; i<arr.length;i++){  
            System.out.print(arr[i]+" ");  
        } 
        System.out.println();

         
        for(int i=0; i<arr.length;i++){  
            java.util.Arrays.sort(arr); 
            System.out.print(arr[i]+" ");  
        } 
     
        System.out.println(); 
        
         int brr[]={3,5,8,2,1};  
        int crr[]={4,9,8,0,1}; 
        boolean B =java.util.Arrays.equals(brr,crr); 
        System.out.print(B); 
    }
}