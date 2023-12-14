class Demo100{ 
    public static void main(String[]arg){ 
        int  a[]={3,5,8,9,6,0}; 
        int max=1; 
        for(int i=0; i<a.length; i++){  
            if(max>a[i]){ 
                max=a[i];
            } 

           // System.out.println(" max value is :"+max);
        } 
        System.out.println(" max value is :"+max);
    } 
}
