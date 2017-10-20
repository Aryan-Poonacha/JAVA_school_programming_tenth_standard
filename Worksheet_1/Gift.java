package Worksheet_1;
import java.io.*;
class Gift
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
int amount = 0;
System.out.println("Enter the item code:");
int code = Integer.parseInt(buffy.readLine());
System.out.println("Input the quantity: ");
int quantity = Integer.parseInt(buffy.readLine());
System.out.println("Enter the rate of the item:");
int rate = Integer.parseInt(buffy.readLine());
amount = rate * quantity;
if ((amount >100) && (amount < 500))
{
System.out.println("Gift is a key chain.");
}
else if((amount > 500) && (amount < 1000))
{
System.out.println("Gift is a leather purse.");
}
else if (amount > 1000)
{
    System.out.println("Gift is a pocket calculator.");
}
}
}
