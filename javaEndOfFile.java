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
public class javaEndOfFile {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 1;
       while(input.hasNextLine())
       {
           System.out.println(counter + " " + input.nextLine());
           counter++;
       }
    }
}
