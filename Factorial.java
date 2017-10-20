import java.io.*;
class Factorial
{
    public static void main(String args[])throws IOException
    {
        int x = 1;
        int i = 10;
        while( i >= 1)
        {
            x = x*i;
            i--;
        }
System.out.println("Factorial of 10 = "+x);
}
}
