//for matrix doigonal max sum
 public class DoigonalMaxSum { 
    public static void main(String[] args) {
        int matrix[][]={{1,2,8}, 
                        {4,5,6}, 
                        {7,8,9}};  
                        int row=matrix.length; 
                        int col=matrix[0].length;
                         
                        int i =0; 
                        int j=0; 
                        //for left doigonal sum 
                        int suml=0; 
                        while(i != row && j != col){ 
                            suml +=matrix[i++][j++];
                        } 
                          
                        //for  right doigonal sum 
                         i =0; 
                         j=col-1; 
                        int sumr=0; 
                        while(i != row && j >=0){ 
                            sumr +=matrix[i++][j--];
                        } 
                        if((suml - sumr) > 0)
                        System.out.println("max doigonal sum is "+(suml - sumr) ); 
                        else 
                        System.out.println("max doigonal sum is "+(sumr - suml) );


    }
    
}
