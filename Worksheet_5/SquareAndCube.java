package Worksheet_5;
import java.io.*;
class SquareAndCube
{
    public int square(int x)
    {
        return x*x;
    }
    
    public int cube(int y)
    {
        return y*y*y;
    }
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));//Question doesn't say input, so not necessary
        SquareAndCube s = new SquareAndCube();
        
        int a  = 2;
        int b = 3;
        
        int f = s.square(a);
        int g = s.cube(b);
    }
}
