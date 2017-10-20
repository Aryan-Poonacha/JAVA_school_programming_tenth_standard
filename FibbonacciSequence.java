import java.io.*;
class FibbonacciSequence
{
    public static void main(String args[])
    {
        int j = 1;
        int i = 0;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + ", " + n2 + ",");
        while(j <=8)
        {
            i =n1 + n2;
            System.out.print(i + ", ");
           n1 = n2;
           n2 = i;
           j++;
        }
    }
}