package ModFuncs;
import java.io.*;
class AutomorphicNos
{
    public static void main(String args[]) throws IOException
    {
    BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter no");
    int x = Integer.parseInt(buffy.readLine());
    int h = x;
    int acc = 0;
    int d = 0;
    while(h>=1)
    {
        d = h%10;
        if(x == 1)
        {
            d = 1;
        }
        acc += Math.pow(d,3);
        h =((int)Math.floor((h/10)));
    }
    
    if(acc == x)
    {
        System.out.println("The no's automorphic.");
    }
    else
    {
        System.out.println("The no's not automorphic.");
    }
}
}