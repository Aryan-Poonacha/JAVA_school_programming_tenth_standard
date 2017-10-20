package Arrays;
import java.io.*;
class SelectionSort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        int A[] = new int [6];
        for(int a = 0; a<A.length; a++)
        {
            System.out.println("Enter the next number:");
            A[a] = Integer.parseInt(buffy.readLine());
        }
        
        int temp = 0; 
        int min = 0;
        
        for(int i =0; i<(A.length-1); i++)
        {
            min = i;
            for(int j = (i+1); j<A.length; j++)
            {
                if(A[min]>A[j])
                {
                    min = j;
                }
                temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
        //print after
    }
}

                