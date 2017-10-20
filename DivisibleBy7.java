import java.io.*;
class DivisibleBy7
{
    public static void main(String args[])
    {
        for (int i = 57; i<= 75; i++)
        {
            if(i%7 == 0)
            {
                System.out.print(i + ", ");
            }
        }
    }
}
