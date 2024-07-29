/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Find Digits [https://www.hackerrank.com/challenges/find-digits]
 * 
 * 1. Break the number into digits and check if each digit is a divisor of the number.
 * 2. if digit is 0 then move to another digit.
 * 3. Increment count for every digit that is a divisor of given number.
 * 
 */
import java.util.Scanner;
public class FindDigits {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=x.nextInt();
            int temp=n,d=0,c=0;
            while(temp>0)
            {
                d=temp%10;
                if( d!=0) if(n%d==0) c++;
                temp/=10;
            }
            System.out.println(c);
        }
        x.close();
    }

}
