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
public class acmIcpcTeam {
    
     public static int stringToInt(String s)
    {
        return Integer.parseInt(s);
    }
    
    public static int[][] transposeForSquareMatrix(int[][] matrix)
    {
        int[][] mirrorMatrix = new int[matrix.length][matrix[0].length];
        try {
            for (int i = 0 ; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                {
                      mirrorMatrix[j][i] = matrix[i][j];
                }
            }
            // To print out array
            for (int i = 0 ; i < mirrorMatrix.length; i++)
            {
                for (int j = 0; j < mirrorMatrix[0].length; j++)
                {
                    System.out.print(mirrorMatrix[i][j]);
                }
                System.out.println();
            }
           
        } catch (Exception e) {
             System.out.println("invalid diemension");
        }
        return mirrorMatrix;
     }
    
    public static void main(String[] args)
    {
           Scanner input = new Scanner(System.in);
         int noOfPeople = input.nextInt();
         int noOfTopics = input.nextInt();
         String[] grid = new String[noOfPeople];
         int[][] Intgrid = new int[noOfPeople][noOfTopics];
       for (int i = 0; i< noOfPeople; i++)
        {
            grid[i] = input.next();
        }
        
        for (int i = 0; i < noOfPeople; i++)
        {
            for (int j = 0; j < noOfTopics ; j++)
            {
            Intgrid[i][j] = stringToInt(grid[i].substring(j,j+1));
          
            }
        }
        
         int maxTopics = 0;
        int noOfTwoPersonTeams = 0;
        
         for (int i = 0; i < noOfPeople-1; i++)
        {
            int counter = 0;
            int z = i + 1;
            for (int j = 0; j < noOfTopics; j++)
            {
               System.out.println(Intgrid[i][j] + " " + Intgrid[z][j]);
               if ((Intgrid[i][j]^Intgrid[z][j]) == 1)
               {
                   counter++;
               }
            }
            System.out.println();
            
            if (counter > maxTopics)
            {
                maxTopics = counter;
            }
            if (counter == maxTopics)
            {
                noOfTwoPersonTeams++;
            }
        }
         
         System.out.println(maxTopics);
         System.out.println(noOfTwoPersonTeams);
         
        
        
    }
}
