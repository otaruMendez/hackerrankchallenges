/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author engr
 */
public class javaBigDecimal {
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int noOfTestcases = input.nextInt();
        
        List<BigDecimal> vals = new ArrayList<>();
        
        for (int i =0; i < noOfTestcases; i++)
        {
            vals.add(new BigDecimal(input.next()));
            
        }
        
        for (int i = 1 ; i < vals.size(); i++)
        {
            for (int j = i-1; j >= 0; j--)
            {
                if (vals.get(i).compareTo(vals.get(j)) == 1)
                {
                    BigDecimal valsd = new BigDecimal("0");
                    BigDecimal valsde = new BigDecimal("0");
                    valsd = vals.get(i);
                    valsde = vals.get(j);
                    vals.add(j, valsd);
                    vals.remove(j+1);
                    vals.add(i, valsde);
                    vals.remove(i+1);

                }
            }
        }
        
        for (BigDecimal varsl : vals)
        {
            System.out.println(varsl);
        }
        
    }
}
