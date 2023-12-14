import java.util.*;//for all import 
 public class Matrix{ 
    public static void main(String [] args){ 
        Scanner sc = new Scanner(System.in); 
        int matrix[][] = new int[3][3];  

        int row = matrix.length; 
        int col = matrix[0].length; 
        //for matrix input 
        System.out.println("enter matrix element ");
        for(int i=0; i<row; i++){ 
            for(int j=0; j<col; j++){ 
                matrix[i][j] = sc.nextInt();
            }
        } 
        //for matrix print
        for(int i=0; i<row; i++){ 
            for(int j=0; j<col; j++){ 
                System.out.print(matrix[i][j]+" ");
            } 
            System.out.println();
        }

    }
}