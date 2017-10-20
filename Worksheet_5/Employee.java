package Worksheet_5;

import java.io.*;
class Employee
{
    public static int pan;
    public static String name;
    public static double taxincome, tax;
    
    public void Input() throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the pan number:");
        Employee.pan = Integer.parseInt(buffy.readLine());
        
        System.out.println("Enter the name:");
        Employee.name = buffy.readLine();
        
        System.out.println("Enter the taxable income:");
        Employee.taxincome = Integer.parseInt(buffy.readLine());
    }
    
    public void Cal()
    {
        if(Employee.taxincome < 100000)
        {
            Employee.tax = 0;
        }
        else if((Employee.taxincome>=100001) || (Employee.taxincome <=150000))
        {
            Employee.tax = (10/100)*Employee.taxincome;
        }
        else if((Employee.taxincome>=150001) || (Employee.taxincome <=250000))
        {
            Employee.tax = 5000+ ((20/100)*Employee.taxincome);
        }
        else if(Employee.taxincome>250000)
        {
            Employee.tax = 25000+ ((30/100)*Employee.taxincome);
        }
    }
    
    public void Display()
    {
        System.out.println("Pan number: "+ Employee.pan);
        System.out.println("Name: " + Employee.name);
        System.out.println("Tax-Income:" + Employee.taxincome);
        System.out.println("Tax: " + Employee.tax);
    }
    
    public static void main(String args[]) throws IOException
    {
        Employee e = new Employee();
        e.Input();
        e.Cal();
        e.Display();
    }
}