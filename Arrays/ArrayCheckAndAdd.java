package Arrays;

import java.io.*;
class ArrayCheckAndAdd
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    int A[] = new int[10];
    int neg = 0;
    int posandeven = 0;
    int even = 0;
    for(int g = 0; g < 10; g++)
    {
        System.out.println("Enter the value of the next element: ");
        A[g] = Integer.parseInt(buffy.readLine());
    }
    
    for(int i = 0; i<10; i++)
    {
        if((A[i] > 0) && (A[i]%2 == 0))
        {
            posandeven += A[i];
        }
        else if(A[i] < 0)
        {
            neg += A[i];
        }
        else if(i%2==0)
        {
            even += A[i];
        }
    }
    System.out.println("Sum of negative numbers: " + neg);
    System.out.println("Sum of positive even numbers: " + posandeven);
    System.out.println("Sum of numbers at even positions: " + even);
}
}