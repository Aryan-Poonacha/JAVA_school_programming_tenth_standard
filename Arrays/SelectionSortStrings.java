package Arrays;

import java.io.*;
class SelectionSortStrings
{
public static void main(String args[]) throws IOException
{
    BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
 
    String A[] = new String[10];
    String temp = "";
    int min = 0;
    
    for(int o =0; o<10; o++)
    {
        System.out.println("Enter the next element: ");
        A[o]= buffy.readLine();
    }
    
    for(int i = 0; i<(A.length-1); i++)
    {
        min = i;
        for(int j = i+1; j<A.length; j++)
        {
            if(A[j].compareToIgnoreCase(A[min])>0)
            {
                min = j;
            }
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
}
}
