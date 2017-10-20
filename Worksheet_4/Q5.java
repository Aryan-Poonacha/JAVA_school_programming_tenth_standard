package Worksheet_4;

import java.io.*;
class Q5
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    int A[] = new int[15];
    int min = 0;
    int temp = 0;
    
    for(int o =0; o<10; o++)
    {
        System.out.println("Enter the next element: ");
        A[o]= Integer.parseInt(buffy.readLine());
    }
    
    for(int i = 0; i<(A.length-1); i++)
    {
        min = i;
        for(int j = i+1; j<A.length; j++)
        {
            if(A[j]<A[min])
            {
                min = j;
            }
            temp = A[i];
            A[i] = A[min];
            A[min] = A[i];
        }
    }
    
    for(int g =0; g<10; g++)
    {
        System.out.println(A[g]);
    }
}
}
