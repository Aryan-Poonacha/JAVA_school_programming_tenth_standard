//X,Y,Z - S
//X+Y - P
//Y+Z - Q
//X+Y+Z - R

package Jan_Easy;

import java.io.*;
import java.util.*;
class Q4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Scanner sc = new Scanner(System.in);
        
        int biggest = 0;
        
        int T = Integer.parseInt(buffy.readLine());
        
        for(int q = 0; q<T; q++)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            sc.useDelimiter(\\n);
            int P = sc.nextInt();
            sc.useDelimiter(" ");
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            
            