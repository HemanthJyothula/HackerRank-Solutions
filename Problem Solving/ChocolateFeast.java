/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- ChocolateFeast [https://www.hackerrank.com/challenges/chocolate-feast]
 * 
 * 1. Count number of chocolates, number of wrappers and chocolates are initially same.
 * 2. For every m wrappers we get 1 chocolate that means 1 wrapper as well
 * 3. For every iteration find number of wrappers and see if they are eligible to get a chocolate.
 * 4. If yes incremet choco and re apply logic.
 * 
 */
import java.util.Scanner;
public class ChocolateFeast {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=x.nextInt();
            int c=x.nextInt();
            int m=x.nextInt();
            int choco=0;
             choco=n/c;
            int wrappers=choco;
            while(true)
            {
                if (m>wrappers || wrappers==0) break;
                choco+=wrappers/m;
                wrappers=wrappers%m+wrappers/m;
            }
            System.out.println(choco);

        }
        x.close();
    }

}
