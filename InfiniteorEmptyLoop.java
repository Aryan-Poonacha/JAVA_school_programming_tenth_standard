import java.io.*;
class InfiniteorEmptyLoop
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Label:
        {
        System.out.println("Press 1 for an infinite loop (infinitely prints 1)");
        System.out.println("Press 2 for an empty loop.");
        int choice = Integer.parseInt(buffy.readLine());
        switch (choice)
        {
            case 1:
            for (int i =1; i<2; i--)
            {
                System.out.println("1");
            }
            break;
            case 2:
            for( int i =2; i<=2; i++)
            {
            }
            break;
            default:
            System.out.println("Incorrect choice.");
            break Label;
        }
    }
}
}
