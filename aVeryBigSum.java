/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author engr
 *  date 05-07-2015 8:15pm
 */
public class aVeryBigSum {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfValues = input.nextInt();
        ArrayList<Long> value = new ArrayList();
        long sum = 0;
        for (int i = 0; i < noOfValues; i++)
        {   
            value.add(input.nextLong());
        }
        for (long val : value)
        {
            sum += val;
        }
        System.out.println(sum);
    }
    
}
