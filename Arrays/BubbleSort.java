package Arrays;
import java.io.*;
class BubbleSort
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
        
        for(int i = 0; i<A.length; i++)
        {
            for(int j = 0; j<(A.length-i); j++)
            {
                if(A[j]>A[j+1])
                {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
        for(int g = 0; g<A.length; g++)
        {
            System.out.println(A[g]);
        }
    }
}
