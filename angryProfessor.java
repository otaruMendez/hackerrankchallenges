/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author engr
 * date - 04-07-2015 12:55am
 */
public class angryProfessor {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        for (int i = 0; i < testCases; i++)
        {
            int noOfStudents = input.nextInt();
            int noOfStudentsToComeEarly = input.nextInt();
            int counter = 0;
            for (int j = 0; j < noOfStudents; j++)
            {
                int studentTimeEntry = input.nextInt();
                if(studentTimeEntry <= 0)
                {
                    counter++;
                }
            }
           
            if (counter >= noOfStudentsToComeEarly)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}
