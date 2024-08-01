/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Halloween Sale [https://www.hackerrank.com/challenges/halloween-sale]
 * 
 * 1. when price >inital budget return 0
 * 2. Else count number of games you can buy before price gets equal to min.
 * 3. And then find number of copies you can get from the remaining amount with minimum price of a game.
 * 
 */
import java.util.Scanner;
public class HalloweenSale {
    public static void main(String args[])
    {   
        Scanner x=new Scanner(System.in);
        int p=x.nextInt(),d=x.nextInt(),m=x.nextInt(),s=x.nextInt();
        int c=0;

        //logic
        if(p>s) c=0;
        else
        {
             while(p>m && s>p)
            {
                s-=p;
                p-=d;
                c++;
            }
       
              if(s>p)
              {
                  p=m;
                c+=s/p;
              }
        }
        System.out.println(c);
        x.close();
    }

}
