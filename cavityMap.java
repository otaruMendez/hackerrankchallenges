package hackerrankchallenges;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engr
 * date - 09-07-2015 7:58PM
 */
public class cavityMap {
    
    public static int stringToInt(String s)
    {
        return Integer.parseInt(s);
    }
    public static void main(String[] args)
    {
        
        
         Scanner input = new Scanner(System.in);
         int gridSize = input.nextInt();
         String[] grid = new String[gridSize];
         int[][] Intgrid = new int[gridSize][gridSize];
         int[][] intGrid2 = new int[gridSize][gridSize];
        for (int i = 0; i<gridSize; i++)
        {
            grid[i] = input.next();
        }
        
        for (int i = 0; i < gridSize; i++)
        {
            for (int j = 0; j < gridSize; j++)
            {
            Intgrid[i][j] = stringToInt(grid[i].substring(j,j+1));
            intGrid2[i][j] = stringToInt(grid[i].substring(j,j+1));
            }
        }
        
        
         if (gridSize > 2)
        {
            for (int i = 1; i < gridSize-1; i++)
             {
                 for (int j = 1; j < gridSize-1; j++)
                 {
                     if (Intgrid[i][j] > Intgrid[i-1][j] && Intgrid[i][j] > Intgrid[i+1][j] && Intgrid[i][j] > Intgrid[i][j+1] && Intgrid[i][j] > Intgrid[i][j-1])
                     {
                         intGrid2[i][j] = 0;
                     }
                 }
             }
        }
        
         for (int i = 0; i < gridSize; i++)
        {
            String output = "";
            for (int j = 0; j < gridSize; j++)
            {
                
                if(intGrid2[i][j] == 0)
                {
                    output += "X";
                }
                else
                {
                    output += Integer.toString(intGrid2[i][j]);
                }
             }
             System.out.println(output);
        }
         
     }
}
