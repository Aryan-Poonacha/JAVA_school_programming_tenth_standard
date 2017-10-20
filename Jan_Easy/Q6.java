//
package Jan_Easy;

import java.io.*;
class Q6
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        int T = Integer.parseInt(buffy.readLine());
        
        int count = 0;
        for(int r = 0; r<T; r++)
        {
            int K = Integer.parseInt(buffy.readLine());
            String x = buffy.readLine();
            for(int i = 0; i<K; i++)
            {
                for(int j = i; j<K; j++)
                {
                    int d = Integer.parseInt(x.substring(i,j+1));
                    if((d%8==0)&&(d%3!=0))
                    {
                        count +=1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}