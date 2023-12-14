class BobbleSort{ 
    public static void main(String[]arg){ 
        int [] a={4,3,7,5,1,9,10}; 
        int temp; 
        for(int i=0;i<a.length-1;i++){ 
            for(int j=i+1; j<a.length; j++){ 
                if(a[i]>a[j]){ 
                    temp=a[i]; 
                    a[i]=a[j]; 
                    a[j]=temp; 
                    //System.out.print(a[j+1]+" ");
                } 
                System.out.print(a[j]+" ");
            } 
           // System.out.print(a[j+1]+" ");
        } 
       //System.out.print(a[j+1]+" ");
    }
}