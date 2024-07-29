/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Extra Long Factorial [https://www.hackerrank.com/challenges/extra-long-factorials]
 * 
 * 1.BigInteger multiply method.
 * 2. Initialized ans biginteger with 1 as its value.
 * 3. Rest of the process is normal interger factorial.
 * 
 */
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        BigInteger ans=BigInteger.valueOf(1);
        while(n>0)
        {
            ans=ans.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(ans);
        x.close();
    }
}
