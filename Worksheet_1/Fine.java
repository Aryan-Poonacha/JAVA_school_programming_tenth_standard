package Worksheet_1;
import java.io.*;
class Fine
{

    public static void main(String args[]) throws IOException
    {
            BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
double fine = 0.00d;
System.out.println("Enter the number of days the book is late:");
int days = Integer.parseInt(buffy.readLine());
if (days <= 5)
{
fine = days * 0.4;
}
else if ((days >= 6) || (days <= 10))
{
fine = days * 0.65;
}
else if (days > 10)
{
fine = days * 0.8;
}
System.out.println("Fine : " +fine);
}
}

