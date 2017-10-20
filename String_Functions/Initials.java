package String_Functions;
import java.io.*;
class Initials
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Enter the name: ");
        String name = (buffy.readLine()).trim();
        int l = name.length();
        String init = "";
        init = init+name.charAt(0)+ ".";
        
        for(int i= 0; i<=l-1; i++)
        {
            char c = name.charAt(i);
            if(c == ' ')
            {
                init = init + name.charAt(i+1) + ".";
            }
        }
        System.out.println("Initials = " + init);
    }
}
