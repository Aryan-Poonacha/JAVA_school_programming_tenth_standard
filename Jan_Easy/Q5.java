//
package Jan_Easy;

import java.io.*;
import java.util.*;
class Q5
{
    
    public int func(String A, String B)
    {
        int answer = 0;
        int check1 = 0;
        int check2 = 0;
        String t = "";
        for(int dig=1;dig<=9;dig++)
        {
            String g = Integer.toString(dig);
            
            for(int d = 0; d<A.length(); d++)
            {
                t = Character.toString(A.charAt(d));
                if(t.equals(dig) == true)
                {
                    check1 = 1;
                }
            }
            
            for(int e = 0; e<A.length(); e++)
            {
                String y = Character.toString(A.charAt(e));
                if(t.equals(dig) == true)
                {
                    check2 = 1;
                }
            }
            
            if((check1 == 1)&&(check2 == 1))
            {
                answer=answer*10+dig;
            }
        }
        return answer;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Scanner sc = new Scanner(System.in);
        Q5 obj = new Q5();
        
        int favs = 0;
        
        int T = Integer.parseInt(buffy.readLine());
        
        for(int w = 0; w<T; w++)
        {
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();
            String A[] = new String[N1];
            String B[] = new String[N2];
            for(int t = 0; t<N1; t++)
            {
                A[t] = buffy.readLine();
            }
            
            for(int p = 0; p<N2; p++)
            {
                A[p] = buffy.readLine();
            }
            
            for(int i =0 ;i<N1; i++)
            {
                for(int j = 0; j<N2; j++)
                if((obj.func(A[i],A[j]))%2 == 0)
                {
                    favs +=1;
                }
            }
            
            System.out.println(favs/(N1*N2));
        }
    }
}