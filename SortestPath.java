//find sortest path  
public class SortestPath{ 
    public static float getSortestPath(String path){ 
        int x = 0,y = 0;  
         
        for(int i=0; i<path.length(); i++){ 
            char direc = path.charAt(i); 
             //for South
            if( direc == 'S'){ 
                y--;
            } 
            //for North 
            else if( direc == 'N'){ 
                y++;
            }  
            //for West
            else if( direc == 'W'){ 
                x--;
            }  
            //for East
            else { 
                x++;
            }
        } 
        //do bindu ke beech ki duri ka formula 
        int X2 = x*x; 
        int Y2 = y*y; 
         
        return (float)Math.sqrt(X2 + Y2);
    } 
    public static void main(String []args){ 
        String path = "WNEENESENNN";  
         
        System.out.println(getSortestPath(path));

    }
}