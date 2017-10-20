import java.io.*;
class SumOf50OddNos
{
    public static void main(String args[])
    {
        int sum = 0;
        int i = 0;
        do 
        {
            if(i%2 != 0)
            {
                sum = sum +i;
            }
            i++;
        }
        while(i <= 50);
        System.out.println("Sum of first 50 odd numbers = " +sum);
    }
}
