package Worksheet_5;
import java.io.*;
////////////////////////////////////////Not sure why the output for this is incorrect////////////////////////////////////////
class Process
{
    int x[] = new int[10];
    
    public void readArray() throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        Process p = new Process();
        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter the next element of the array:");
            p.x[i] = Integer.parseInt(buffy.readLine());
        }
    }
    
    public void showArray()
    {
        Process p = new Process();
        for(int i=0;i<10; i++)
        {
            System.out.println(p.x[i]);
        }
    }
    
    public int findsmallest()
    {
        Process p = new Process();
        int min = p.x[0];
        for(int i=0; i<10; i++)
        {
            min = Math.min(min,p.x[i]);
        }
        return min;
    }
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        Process p = new Process();
        p.readArray();
        p.showArray();
        int min = p.findsmallest();
    }
}