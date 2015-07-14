package hackerrankchallenges;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author engr  
 * date - 02-07-2015 5:10pm
 */
public class findDigits {
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for (int i = 0; i < testCases; i++)
        {
            int counter = 0;
            int no = input.nextInt();
            String noInString = Integer.toString(no);
            for (int j = 0; j < noInString.length(); j++)
            {
                int convertToInt = Integer.parseInt(noInString.substring(j,j+1));
                if(convertToInt == 0){}
                else
                {
                  if(no%convertToInt == 0){
                    counter++;}
                }
            }
            System.out.println(counter);
        }
    }
}
