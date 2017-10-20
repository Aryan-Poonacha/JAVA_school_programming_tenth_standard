package Worksheet_4;
import java.io.*;
class Q1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        int A[] = new int[13];
        int B[] = new int[13];
        int C[] = new int[13];
        
        for(int d = 0; d<13; d++)
        {
            System.out.println("Array 1: Enter the next value:");
            A[d] = Integer.parseInt(buffy.readLine());
        }
        
        for(int d = 0; d<13; d++)
        {
            System.out.println("Array 2: Enter the next value:");
            A[d] = Integer.parseInt(buffy.readLine());
        }
        
        for(int d = 0; d<13; d++)
        {
            C[d] = A[d] + B[d];
        }
        
        System.out.println("Resultant Array Values:");
        
        for(int d = 0; d<13; d++)
        {
            System.out.println(C[d]);
        }
        }
    }
    