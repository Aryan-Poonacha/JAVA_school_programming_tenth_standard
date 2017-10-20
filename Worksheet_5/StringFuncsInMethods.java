package Worksheet_5;

import java.io.*;
class StringFuncsInMethods
{
    public void characters(String x)
    {
        int Upcase = 0;
        int Lowcase = 0;
        
        int l = x.length();
        for(int i=0;i<l;i++)
        {
            char c = x.charAt(i);
            if(Character.isUpperCase(c) == true)
            {
                Upcase += 1;
            }
            if(Character.isLowerCase(c) == true)
            {
                Lowcase +=1;
            }
        }
        System.out.println("Number of Uppercase Letters= " + Upcase);
        System.out.println("Number of Lowercase Letters= " + Lowcase);
    }
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        StringFuncsInMethods s = new StringFuncsInMethods();
        
        System.out.println("Enter the string:");
        String a = buffy.readLine();
        
        s.characters(a);
    }
}