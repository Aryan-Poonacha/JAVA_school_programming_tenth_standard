package String_Functions;
import java.io.*;
class ReverseEachWord
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the sentence: ");
        String sentence = (buffy.readLine()).trim();
        String s2 = "";
        String word = "";
        String w2 = "";
        int l1 = sentence.length();
        for(int i = 0; i<=(l1=1); i++)
        {
            char c = sentence.charAt(i);
            word = word + c;
            if(c==' ')
            {
                word = word.trim();
                int l2 = word.length();
                for(int j = (l2-1); j>=0; j--)
                {
                    w2 = w2 + word.charAt(j);
                }
                s2 += w2 + " ";
                w2 = "";
                word = "";
            }
        }
        System.out.println("New sentence is: " + s2);
    }
}