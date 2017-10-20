import java.io.*;
class SValue2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader( new InputStreamReader (System.in));
       double S = 0.00d;
       int i =0;
       System.out.println("Enter the value of n: ");
       int n = Integer.parseInt(buffy.readLine());
       System.out.println("Enter the value of a: ");
       int a = Integer.parseInt(buffy.readLine());
       while ( i<= n)
       {
           S = S + Math.pow(a,i);
        i = i+1;
    }
    System.out.println("The value of S = " +S);
}
}
