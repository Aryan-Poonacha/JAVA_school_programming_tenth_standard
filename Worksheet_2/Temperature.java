package Worksheet_2;

import java.io.*;
class Temperature
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        double F = 0.00d;
        double C = 0.00d;
        System.out.println("Press 1 to convert from C to F.");
        System.out.println("Press 2 to convert from F to C.");
        int choice = Integer.parseInt(buffy.readLine());
        switch(choice)
        {
            case 1:
            System.out.println("Enter the value of C:");
            C = Integer.parseInt(buffy.readLine());
            F = 1.8*C+32;
            System.out.println(C+ " In F = " +F);
            break;
            case 2:
            System.out.println("Enter the value of F:");
            F = Integer.parseInt(buffy.readLine());
            C = 5/9*(F-32);
            System.out.println(F+ " In C = " +C);
            break;
        }
    }
}
