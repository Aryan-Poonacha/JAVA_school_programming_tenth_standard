package Worksheet_2;
import java.io.*;
class Calculator
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        double n1= 0.00d;
        double n2 = 0.00d;
        double answer = 0.00d;
        System.out.println("CALCULATOR");
        System.out.println("Enter the first number: ");
        n1 = Double.parseDouble(buffy.readLine());
        System.out.println("Enter the second number: ");
        n2 = Double.parseDouble(buffy.readLine());
        Label:
        {
        System.out.println("Press + to Add");
        System.out.println("Press - to Subtract");
        System.out.println("Press * to multiply");
        char c = (buffy.readLine()).charAt(0);
        switch (c)
        {
        case '+':
            answer = n1 + n2;
            break;
        case '-':
            answer = n1-n2;
            break;
        case '*':
        answer = n1*n2;
        break;
        default:
        System.out.println("Incorrect choice.");
        break Label;
    }
}
System.out.println("The answer is " +answer);
}
}
