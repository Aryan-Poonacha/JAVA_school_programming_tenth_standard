//Question: https://www.hackerearth.com/january-easy-17/problems/
package Jan_Easy;

import java.io.*;
import java.util.*;
class Q1
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        
        int smallestE = 0;
        int smallestI = 0;
        int check = 0;
        int r = 0;
        
        int T = Integer.parseInt(buffy.readLine());
        
        for(int q = 0; q<T; q++)
        {
            int N = Integer.parseInt(buffy.readLine());
            int A[] = new int[N];

            for(int y = 0; y<N; y++)
            {
                A[y] = sc.nextInt();
            }
            
            smallestE = A[0];
            for(r = 0; r<N; r++)
            {
                if(A[r]<smallestE)
                {
                    smallestE = A[r];
                    smallestI = r;
                }
            }
            
            for(int h = 0; h<N; h++)
            {
                A[h] -= r;
            }
            
            for(int e = 0; e<N; e++)
            {
                if(A[e]<0)
                {
                   for(int u = e; u<N;u++)
                   {
                       A[u] = A[u+1];
                       if(u == N-1)
                       {
                           A[u] = 0;
                        }
                    }
                }
            }
            
            for(int b = 0; b<N; b++)
            {
                if(A[b]!=0)
                {
                    check+=1;
                }
            }
            
            if(check == 1)
            {
                System.out.println("Ladia");
            }
            else if(check == 0)
            {
                System.out.println("Kushagra");
            }
        }
    }
}