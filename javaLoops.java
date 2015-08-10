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
public class javaLoops {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTestCases = input.nextInt();
        
        for(int q = 0; q < noOfTestCases; q++){
            
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        
        int firstTerm = a + b;
        
        
        for (int i = 1; i <= n; i++)
        {
            System.out.print(firstTerm + " ");
            firstTerm += ((Math.pow(2,i))*b); 
        }
            System.out.println("");
    }
    }
}
