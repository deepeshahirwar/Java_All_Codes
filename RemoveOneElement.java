class RemoveOneElement{ 
    public static void main(String[]arg){ 
        int a[]={10,40,30,80,60,20}; 
        int del_element=40; 
        for(int i=0;i<a.length;i++){ 
            if(del_element==a[i]){  
                for(int j=i;j<a.length-1;j++){ 
                    a[j]=a[j+1];
                }
                break;
            }
        }  System.out.println(" 40 is deleted :");
        for(int i=0;i<a.length-1;i++){ 
             
            System.out.println(a[i]+" ");
        } 
    
    }
}