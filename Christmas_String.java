//Question: https://www.hackerearth.com/december-circuits-16/algorithm/christmas-string/
import java.io.*;
class Christmas_String
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        
        System.out.println("Enter the star string:");
        String S = buffy.readLine();
        
        System.out.println("Enter the number of names on the list:");
        int N = Integer.parseInt(buffy.readLine());
        
        int acc = 0;
        int l1 = S.length();
        
        for(int i = 1; i<=N; i++)
        {
            System.out.println("Enter the next name on the list:");
            String x = buffy.readLine();
            int l2 = x.length();
            if(l2 == l1)
            {
              for(int j = 0; j<l1; j++)
              {
                char c = S.charAt(j);
                if(c == '*')
                {
                    int g = S.indexOf(c);
                    char d = x.charAt(g);
                    String f = S.replace(c,d);
                    if(f.equals(S) == true)
                    {
                        acc+=1;
                    }
                }
              }
            }
        }
        System.out.println(acc);
    }
}