package Worksheet_2;
import java.io.*;
class Volume
{
public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        double volume = 0.00d;
        Label:
        {
        System.out.println("Press 1 to find the volume of a cube.");
        System.out.println("Press 2 to find the volume of a sphere.");
        System.out.println("Press 3 to find the volume of a cuboid.");
        int choice = Integer.parseInt(buffy.readLine());
        switch (choice)
        {
            case 1:
            System.out.println("Enter the value of s:");
            int s = Integer.parseInt(buffy.readLine());
            volume = s*s*s;
            break;
            case 2:
            System.out.println("Enter the value of r:");
            int r = Integer.parseInt(buffy.readLine());
            volume = 4*22/7*r*r*r;
            break;
            case 3:
            System.out.println("Enter the value of l");
            int l = Integer.parseInt(buffy.readLine());
            System.out.println("Enter the value of b");
            int b = Integer.parseInt(buffy.readLine());
            System.out.println("Enter the value of h");
            int h = Integer.parseInt(buffy.readLine());
            volume = l*b*h;
            break;
            default:
            System.out.println("Incorrect choice.");
            break Label;
        }
    }
    System.out.println("The volume is "+volume);
}
}