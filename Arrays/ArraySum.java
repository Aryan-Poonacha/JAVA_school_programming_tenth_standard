package Arrays;

import java.io.*;
class ArraySum
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
    
    int A[] = new int[13];
    int B[] = new int[13];
    int C[] = new int[13];
    
    for(int y = 0; y<13; y++)
            {
                System.out.println("Enter the next element of array 1");
                A[y] = Integer.parseInt(buffy.readLine());
            }
    for(int t = 0;t <13; t++)
                {
                  System.out.println("Enter the next element of array 2");
                  A[t] = Integer.parseInt(buffy.readLine());
                }
         
    for(int j = 0; j<13; j++)
    {
        C[j] = A[j] + B[j];
    }
    
    System.out.println("Values in array 3 are:");
    for(int a = 0; a<13; a++)
    {
        System.out.println(C[a]);
    }
}
}
