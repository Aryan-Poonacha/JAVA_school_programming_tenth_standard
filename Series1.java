import java.io.*;
class Series1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the value of n:");
        int n = Integer.parseInt(buffy.readLine());
        for(int i =4; i<=n; i= i*2)
        {
            System.out.print(i + ", ");
        }
    }
}
