/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author engr
 */
public class matrixRotationAlgo {
    
    public static boolean onEdge(int i,int j, int start, int end, int[][] matrix)
    {
        if ((i != start && j != 0) || (i != 0 && j != matrix[0].length) || (i != matrix.length && j != 0) || (i != matrix.length && j != matrix[0].length))
                {
                     return true;
                }
        else
        {
            return false;
        }
       
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int r = input.nextInt();
        
        int[][] fixedMatrix = new int[m][n];
        int[][] rotatedMatrix = new int[m][n];
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                fixedMatrix[i][j] = input.nextInt();
            }
        }
        
        
        int start = 0;
        int end = fixedMatrix[0].length-1;
        while (start != end)
        {
            
        }
        
    }
}
