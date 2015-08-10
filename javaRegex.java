/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankchallenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author engr
 */
public class javaRegex {
 
    public static void main(String[] args)
    {
         String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern myparten = Pattern.compile(IPADDRESS_PATTERN);
        Matcher mymatcher ;
        Scanner input = new Scanner(System.in);
        String val;
        while(input.hasNext())
        {
           val  = input.next();
           mymatcher = myparten.matcher(val);
           System.out.println(mymatcher.matches());
        }
        
      
    }
    
}

class myRegex
{
     String pattern = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
