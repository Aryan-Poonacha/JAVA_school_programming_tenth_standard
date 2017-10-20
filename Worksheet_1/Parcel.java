package Worksheet_1;
import java.io.*;
class Parcel
{
    public static void main(String args[]) throws IOException
    {
            BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
System.out.println("Enter the weight in grams:");
int weight = Integer.parseInt(buffy.readLine());
int charge = 0;
int extra_charge = 0;
int extra_weight = 0;
int weightby500 = 0;
if (weight <= 1000)
{
    charge = 15;
}
else if (weight > 1000)
{
    weightby500 = (weight-1000) % 500;
    if (weightby500 == 0)
    {
        extra_charge = ((weight-1000)/500)*8;
        charge = charge +  extra_charge +15;
    }
    else if(weightby500 != 0)
    {
        extra_weight = (weight-1000) - weightby500;
        extra_charge = ((extra_weight/500)*8)+8;
        charge = charge + extra_charge +15;
    }
}
System.out.println("Total charges = " + charge);
}
}