/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Repeated String [https://www.hackerrank.com/challenges/repeated-string]
 * 
 * 1. Let actual string be s. Find  number of times 'a' is repeated in the string s
 * 2. Divide the given length with length of the string s, a will repeat result value * (number of repetitions of 'a' in string s)
 * 3. Lastly find number of 'a' in the substring of 0 to remainder value from step 2
 * 4. Cant use default substring method as it takes int as a parameter.
 * 
 */

import java.util.Scanner;
public class RepeatedString {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.next();
        long n=x.nextLong();

        //logic
        long n1=n/s.length(),n2=n%s.length();
        long c=0,ca=0,ca1=0;
        for(int i=0;i<s.length();i++) if (s.charAt(i)=='a') ca++;
        c+=ca*n1;
        for(int i=0;i<n2;i++) if(s.charAt(i)=='a') ca1++;
        c+=ca1;

        System.out.println(c);

        x.close();
    }

}
