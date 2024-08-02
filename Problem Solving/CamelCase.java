/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- CamelCase [https://www.hackerrank.com/challenges/camelcase]
 * 
 * 1. By Default ever string has one word so count =1
 * 2. For every subsequent Capital Letter a new word is detected and the count increases
 * 3. Print the count
 * 
 */
import java.util.Scanner;

public class CamelCase {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.next();
        int c=1;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') c++;
        System.out.println(c);
        x.close();

    }

}
