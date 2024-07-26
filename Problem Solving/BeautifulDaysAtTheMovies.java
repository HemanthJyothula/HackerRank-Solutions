/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Angry Professor [https://www.hackerrank.com/challenges/angry-professor]
 * 
 * 1.Run a loop with the give range, check if absolute difference of number and its reverse (numbers from the range)
 *  is divisible by given integer k or not.
 * 2. If divisible icrement count by 1 and finally print count.
 * 
 */

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int i=x.nextInt(),j=x.nextInt(),k=x.nextInt(),c=0;
        for(int f=i;f<=j;f++)
        {
            int t=f;
            int r=0;
            while(t>0)
            {
                int remainder=t%10;
                r=r*10+remainder;
                t=t/10;
            }
            if(Math.abs(f-r)%k==0) c++;
        }
        System.out.println(c);
        x.close();
    }
}
