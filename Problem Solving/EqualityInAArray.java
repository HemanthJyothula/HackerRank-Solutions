import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
        HashSet<Integer> a1=new HashSet<Integer>(arr);
        Iterator<Integer> it=a1.iterator();
        int maxf=0,t=0,a=0,count=0,maxele=0;
        while(it.hasNext())
        {   
             a=it.next();
             t=Collections.frequency(arr, a);
             if(t>maxf) 
             {
                 maxf=t;
                maxele=a;
             }  
        }
        it=a1.iterator();
        while(it.hasNext())
        {   
             a=it.next();
             t=Collections.frequency(arr, a);
             if(t!=maxf) count+=t;
             else if(t==maxf && a!=maxele) count+=t;  
        }
        return count;
       
    }

}

public class EqualityInAArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
