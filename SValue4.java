import java.io.*;
class SValue4
{
    public static void main(String args[])
    {
        int S = 0; 
        int acc = 1;
        for(int i = 1; i<10; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                acc = acc*j;
            }
            S = S + acc;
        }
        System.out.println(S);
    }
}
