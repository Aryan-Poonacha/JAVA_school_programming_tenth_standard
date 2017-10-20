import java.io.*;
class ConstDoubt
{
    int a, b;
    ConstDoubt()
    {
       a = 25;
       b = 45;
    }
    ConstDoubt(int x, int y)
    {
        a = x;
        b = y;
    }
    
    public static void main(String args[])
    {
        ConstDoubt c = new ConstDoubt(10, 20);
        System.out.println(c.a);
    }
}
