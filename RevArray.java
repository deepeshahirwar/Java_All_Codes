class RevArray{ 
    public static void main(String []arg){ 
        int [] a={1,2,3,4,5,6}; 
         int l=a.length; 
        int n=Math.floorDiv(l,2);//for 5/2=2.5 
        //but 2.5=2 return 
        int temp; 
        for(int i=0;i<n;i++){//swaping  
            temp=a[i]; 
            a[i]=a[l-1-i];
            a[l-1-i]=temp;
        } 
        for(int element:a){ //for print revers element of array
            System.out.print(element+" ");
        } 
        //maximun and min element in array 
        int min=1;  
        for(int element:a){//for min element 
            if(element<min){ 
                min=element;
            } 

        } 
        System.out.print(" array of min element is:"+min);
       
    }
}