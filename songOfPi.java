/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author engr
 */
public class songOfPi {
    
    public static void main(String[] args)
    {
        String pi = "314159265358979323846";
        String inputVAl = " ";
        Vector no = new Vector();
//        for (int i = 0; i < pi.length(); i++)
//        {
//            no.add(pi.substring(i, i+1));
//        }
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        
        for (int i = 0; i < testCases; i++)
        {
            String avl = input.nextLine();
            String[] words = avl.split(" ");
            for (int j = 0; j < words.length; j++)
            {
                inputVAl += Integer.toString(words[j].length());
            }
        }
        System.out.println(inputVAl);
    }
}
