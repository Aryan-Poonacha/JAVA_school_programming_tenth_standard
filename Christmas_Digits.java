//Question: https://www.hackerearth.com/december-circuits-16/algorithm/christmas-digits/

import java.io.*;
import java.utils.*;
class Christmas_Digits
{
    public static void main(String args[])throws IOException
    {
        Scanner s = new Scanner();
        int n = s.nextInt();
        int k = s.nextInt();
        int x = s.nextint();
        
        int biggest = 0;
        
        for(int  i= 0; i<k; i++)
        {
            String f = n.toString();
            