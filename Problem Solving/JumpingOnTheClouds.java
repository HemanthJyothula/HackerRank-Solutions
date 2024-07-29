/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Jumping on the Clouds -- [https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited]
 * 
 * 1. Calculate jump as given in question, for every jump 1 unit energy is consumed, 
 * 2. If he lands on thunderhead additional 2 units of energy is consumed.
 * 3. Cycle ends when jump is equal to 0
 * 
 */
import java.util.Scanner;
public class JumpingOnTheClouds {
    public static void main (String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int k=x.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++) c[i]=x.nextInt();

        int jump=0,energy=100;
        for(int i=0;i<n;i++)
        { 
            jump= (i+k)%n;
            energy--;
            if(c[jump]==1) energy-=2;
            if(jump==0) break;
            i=jump-1;
        }
        System.out.println(energy);
        x.close();
    }

}
