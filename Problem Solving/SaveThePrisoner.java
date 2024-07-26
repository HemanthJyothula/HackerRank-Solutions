/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Save the Prisoner [https://www.hackerrank.com/challenges/save-the-prisoner]
 * 
 * 1.Sweets + starting seat number when divided by number of people gives the last seat.
 * 
 */
import java.util.Scanner;

public class SaveThePrisoner {
        public static void main(String args[])
        {   
            Scanner x=new Scanner(System.in);
            int t=x.nextInt();
            for(int i=0;i<t;i++)
            {
                int n=x.nextInt();
                int m=x.nextInt();
                int s=x.nextInt();
                int seat= (m+s-1)%n==0?n:(m+s-1)%n;
                System.out.println(seat);
            }
            x.close();
        }
}
