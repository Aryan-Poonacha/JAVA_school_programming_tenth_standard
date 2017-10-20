package Worksheet_5;
import java.io.*;
//This question's not clear at all
class Volume
{
    public int vc(int s)
    {
        return s*s*s;
    }
    
    public double vs(int r)
    {
        return ((1/3)*(22/7)*r*r*r);
    }
    
    public int vc(int l, int b, int h)
    {
        return l*b*h;
    }
    
        public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        Volume v = new Volume();
        
        System.out.println("Enter the value of s:");
        int s = Integer.parseInt(buffy.readLine());
        
        System.out.println("Enter the value of r:");
        int r = Integer.parseInt(buffy.readLine());
        
        System.out.println("Enter the value of l:");
        int l = Integer.parseInt(buffy.readLine());
        System.out.println("Enter the value of b:");
        int b = Integer.parseInt(buffy.readLine());
        System.out.println("Enter the value of h:");
        int h = Integer.parseInt(buffy.readLine());
        
        int a = v.vc(s);
        double j = v.vs(r);
        int c = v.vc(l,b,h);
        
        System.out.println("The volume of the cube is:" + a);
        System.out.println("The volume of the sphere is:" + j);
        System.out.println("The volume of the cuboid is:" + c);
    }
}