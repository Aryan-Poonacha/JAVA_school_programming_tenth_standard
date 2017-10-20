import java.io.*;
class SValue3
{
    public static void main(String args[])
    {
        double S = 0.00d;
        double i =1;
        while( i<=19)
        {
            S = S + (i/(i+1));
            i = i +1;
        }
        System.out.println("The value of S = " +S);
    }
}
