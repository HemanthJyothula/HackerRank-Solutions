/**
 * @author HemanthJyothula
 * 
 * Problem Statement -- Minimum Distances [https://www.hackerrank.com/challenges/minimum-distances]
 * 
 * 1. Compare every element with every other element in the forward direction with two loops
 * 2. If they are equal, find the difference 
 * 3. Print the minimum distance of all (Used a min variable to store min distace whenever a new minimum is found)
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistances {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<Integer>();
        int n=x.nextInt();
        for(int i=0;i<n;i++) a.add(x.nextInt());
        int min=Integer.MAX_VALUE;
                for(int i=0;i<a.size();i++)
                {   
                    int dis=Integer.MAX_VALUE;
                    for(int j=i+1;j<a.size();j++)
                    {
                        if(a.get(i).equals(a.get(j)))
                        {   
                            dis=j-i;
                            break;
                        }
                    }
                    if(dis<min ) min=dis; 
                }
                if(min==Integer.MAX_VALUE) min=-1;
                System.out.println(min);
                x.close();
        }

}
