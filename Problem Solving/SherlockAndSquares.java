/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Sherlock and Squares [https://www.hackerrank.com/challenges/sherlock-and-squares]
 * 
 * 1. Find the closest square roots to each ends of given range.
 * 2. Run a loop with those square roots to check if the square of them lies in between the given range.
 * 3. If yes increment c.
 * 
 */
import java.util.Scanner;
public class SherlockAndSquares {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int j=0;j<t;j++)
        {
            int a=x.nextInt();
            int b=x.nextInt();
            int A=(int)Math.sqrt(a);
            int B=(int)Math.sqrt(b);
            int c=0;
            for(int i=A;i<=B;i++) if (Math.pow(i,2)>=a && Math.pow(i,2)<=b) c++;
            System.out.println(c);
        }
        x.close();
    }

}
