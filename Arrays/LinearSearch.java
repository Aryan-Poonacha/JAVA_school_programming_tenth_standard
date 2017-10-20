package Arrays;
import java.io.*;
class LinearSearch
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
        for(int j = 0; j<A.length; j++)
        {
            if(A[j] == x)
            {
                System.out.println("Position: " + j);
            }
            else
            {
                System.out.println("Number not found.");
            }
        }

    }
}
