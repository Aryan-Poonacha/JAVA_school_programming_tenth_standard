package Arrays;
import java.io.*;
class BinarySearch
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        int A[] = new int[5];
        for(int i = 0; i<A.length; i++)
        {
            System.out.println("Enter the next number: ");
            A[i] = Integer.parseInt(buffy.readLine());
        }
        System.out.println("Enter the number to find:");
        int x = Integer.parseInt(buffy.readLine());
        
        int flag = 0; 
        int p = 0;
        int pos = 0;
        int ub = A.length;
        int lb = 0;
        while(lb<=ub)
        {
            p = (ub+lb)/2;
            if(A[p]<x)
            {
                lb = p + 1;
            }
            else if(A[p] > x)
            {
                ub = p -1;
            }
            else if(A[p] == x)
            {
                flag = 1;
                pos = p;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Not found.");
        }
        else if(flag == 1)
        {
            System.out.println("Found at " + pos);
        }
    }
}
