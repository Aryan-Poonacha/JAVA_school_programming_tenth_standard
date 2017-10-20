package Worksheet_4;

import java.io.*;
class Q3
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    int A[] = new int[10];
    int max = 0;
    int min = 0;
    
    for(int o =0; o<10; o++)
    {
        System.out.println("Enter the next element: ");
        A[o]= Integer.parseInt(buffy.readLine());
    }
    
    max = A[0];
    min = A[0];
    
    for(int i = 1; i<10; i++)
    {
        max = Math.max(max, A[i]);
        min = Math.min(min, A[i]);
    }
    System.out.println("The minimum number is: " + min);
    System.out.println("The maximum number is: " + max);
}
}
