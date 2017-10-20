package Arrays;
import java.io.*;
class Insertion
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        int A[] = new int[11];
        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter the next number: ");
            A[i] = Integer.parseInt(buffy.readLine());
        }
        
        System.out.println("Enter the number you wush to add:");
        int no = Integer.parseInt(buffy.readLine());
        
        System.out.println("Enter the position:");
        int pos = Integer.parseInt(buffy.readLine());
        
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i = 0; i<11; i++)
        {
            if(i == pos)
            {
                temp1 = A[i];
                A[i] = no;
                temp2 = A[i+1];
                A[i+1] = temp1;
            }
            if(i > pos)
            {
                temp1 = A[i];
                A[i] = A[i+1];
                A[i+1] = temp1;
            }
        }
        
        System.out.println("New array values:");
        
        for(int d = 0; d<11; d++)
        {
            System.out.println(A[d]);
    }
}
}
