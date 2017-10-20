package Worksheet_4;

import java.io.*;
class Q4
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    String A[] = new String[5];
    
    for(int o =0; o<10; o++)
    {
        System.out.println("Enter the next element: ");
        A[o]= buffy.readLine();
    }
    
    for(int i = 0; i<5; i++)
    {
        if((A[i].endsWith("a")==true)&&((A[i].endsWith("a")) == true))
        {
            System.out.println(A[i]);
        }
    }
}
}
