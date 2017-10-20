import java.io.*;
class PatternChoice
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("PATTERNS");
        System.out.println("1.Alternate * and # five times!");
        System.out.println("2.5 4 3 2 1 removing one number 5 times!");
        int choice = Integer.parseInt(buffy.readLine());
        switch (choice)
        {
            case 1:
            String symbol = "";
            for(int i =0; i<=5; i++)
            {

                for(int j = 0; j<=i; j++)
                {
                    if( j%2 != 0)
                    {
                        symbol = "#";
                    }
                    else if(j%2 == 0)
                    {
                        symbol = "*";
                    }
                    System.out.print(symbol + " ");
                }
                                System.out.println();
                }
                break;
            case 2:
            for(int g = 1; g <= 5; g++)
            {
                for(int f = 5; f >= g; f--)
                {
                    System.out.print(f + " ");
            }
                            System.out.println();
        }
        break;
        default:
        System.out.println("Incorrect choice.");
    }
}
}
