package Arrays;
import java.io.*;
class Merging
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[10];
        for(int i = 0; i<A.length; i++)
        {
            System.out.println("Enter the next number: ");
            A[i] = Integer.parseInt(buffy.readLine());
        }
         for(int a = 0; a<B.length; a++)
        {
            System.out.println("Enter the next number: ");
            B[a] = Integer.parseInt(buffy.readLine());
        }
        
        for(int c = 0; c<10; c++)
        {
            if(c<5)
            {
                C[c] = A[c];
            }
            else if(c>=5)
            {
                C[c] = A[c-5];
            }
        }
        for(int g=0; g<10; g++)
        {
            System.out.println(C[g]);
        }
    }
}