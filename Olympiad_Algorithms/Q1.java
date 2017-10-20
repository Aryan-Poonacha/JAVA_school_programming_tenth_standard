package Olympiad_Algorithms;

import java.io.*;
class Q1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows/columns:");
        int x = Integer.parseInt(bufffy.readLine());
        int A[][] = new int[x-1][x-1];
        
        System.out.println("Enter the numbers:");
        for(int i = 0; i<x; i++)
        {
            for(int j = 0; j<x; j++)
            {
                sc.useDelimiter(" ");
                A[i][j] = nextInt();
            }
        }
        
        int a = 0;
        int b = 0;
        int S = 0;
        
        S+=A[0][0];
        
        int rightcheck = 0; 
        int leftcheck - 0;
        
        if(