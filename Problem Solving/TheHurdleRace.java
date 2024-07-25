/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- The Hurdle Race [https://www.hackerrank.com/challenges/the-hurdle-race]
 * 
 * find max hurdle height and compare it with player height capacity to find number of potions required.
 */
import java.util.Arrays;
import java.util.Scanner;
public class TheHurdleRace {
    public static void main(String args[])
    {
        Scanner x= new Scanner(System.in);
        int n=x.nextInt();
        int initial_height=x.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++) a[i]=x.nextInt();

        Arrays.sort(a);
        int max_hurdle_height=a[a.length-1];
        if(initial_height>=max_hurdle_height) System.out.println(0);
        else System.out.println(max_hurdle_height-initial_height);

        x.close();
    }

}
