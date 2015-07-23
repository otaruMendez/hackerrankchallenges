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
public class journeyToTheMoon {
    
     public static int factorial(int value)
    {
        if(value == 1)
        {
            return 1;
        }
        else
        {
            return value * factorial(value-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNo = input.nextInt();
        
        
        Vector values1 = new Vector();
        Vector values2 = new Vector();
         
        for (int i = 0; i < secondNo*2; i++)
        {
            values1.add(input.nextInt());
        }
        for (int i = 0; i < secondNo*2; i++)
        {
            if (!values2.contains(values1.get(i)))
            {
                 values2.add(values1.get(i));
            }
        }
         for (int i = 0; i < values2.size(); i++)
        {
            System.out.println(values2.get(i));
        }
     //   System.out.println(factorial(values2.size()));
      
    }
}
