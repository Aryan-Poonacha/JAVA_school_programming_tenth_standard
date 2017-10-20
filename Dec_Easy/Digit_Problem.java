//Question: https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/
package Dec_Easy;
import java.io.*;
class Digit_Problem
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("LUL");
        String x = buffy.readLine();
        String one = "";
        int K = 0;
        int f = 0;
        for(int g = 0; g<x.length(); g++)
        {
            char h = x.charAt(g);
            if(h == ' ')
            {
                one = x.substring(0,g);
                K = Integer.parseInt(x.substring(g+1,x.length()));
            }
        }
        
        for(int i = 0; i<(one.length()); i++)
        {
            while(f<=K)
            {
                char c = one.charAt(i);
                if(c!='9')
                {
                      one = one.replace(c,'9');
                      f+=1;
                }
                else if(c=='9')
                {
                    break;
                }
            }
        }
        System.out.println(one);
    }
}
