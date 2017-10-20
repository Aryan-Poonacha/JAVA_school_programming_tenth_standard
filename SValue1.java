import java.io.*;
class SValue1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader( new InputStreamReader (System.in));
       double S = 0.00d;
       double i =1;
       System.out.println("Enter the value of n: ");
       int n = Integer.parseInt(buffy.readLine());
       while (i <= n)
       {
           S = S + (1/i);
           i = i+1;
        }
    System.out.println("the value of S = " + S);
}
}
