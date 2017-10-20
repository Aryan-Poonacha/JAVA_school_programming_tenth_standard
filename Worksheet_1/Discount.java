package Worksheet_1;
import java.io.*;
class Discount
{
    public static void main(String args[]) throws IOException
    {
         BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        double discount = 0;
        double net_amount = 0;
System.out.println("Enter your name:");
String name = buffy.readLine();
System.out.println("Enter your address");
String address = buffy.readLine();
System.out.println("Enter the type of purchase: L for Laptop, D for Desktop");
String type = (buffy.readLine()).toUpperCase();
System.out.println("Enter the amount of purchase:");
int amount = Integer.parseInt(buffy.readLine());
if (type == "L")
{
    if ((amount <= 25000) || (amount >= 0))
    {
discount = amount*(5/100);
}
else if ((amount >= 25001) || (amount <= 57000))
{
discount = amount*(7.5/100);
}
else if ((amount >= 57001) || (amount <= 100000))
{
    discount = amount*(10/100);
}
else if (amount > 100000)
{
    discount = amount*(15/100);
}
}
else if (type == "D")
{
     if ((amount <= 25000) || (amount >= 0))
    {
discount = amount*(0/100);
}
else if ((amount >= 25001) || (amount <= 57000))
{
discount = amount*(5/100);
}
else if ((amount >= 57001) || (amount <= 100000))
{
    discount = amount*(7.5/100);
}
else if (amount > 100000)
{
    discount = amount*(10/100);
}
}
net_amount = amount - discount;
System.out.println("Name : " +name);
System.out.println("Address : " +address);
System.out.println("Discount : " +discount);
System.out.println("Net amount : " +net_amount);
}
}
