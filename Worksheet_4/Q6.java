package Worksheet_4;

import java.io.*;
class Q6
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    String A[] = new String[10];
    String temp = "";
    
    for(int o =0; o<10; o++)
    {
        System.out.println("Enter the next element: ");
        A[o]= buffy.readLine();
    }
    
    for(int i = 0; i<A.length; i++)
    {
        for(int  j  = 0; j<(A.length-i); j++)
        {
            if(A[j].compareToIgnoreCase(A[j+1])>0)
            {
               temp = A[i];
               A[i] = A[j];
               A[j] = A[i];
            }
        }
    }
}
}