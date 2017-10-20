package Loop_Patterns;
import java.io.*;
class PatternInvertedTriangleNegative
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the value of n");
        int n = Integer.parseInt(buffy.readLine());
        
        for(int i = n; i>=1; i--)
        {
            for(int j = i; j>=1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
