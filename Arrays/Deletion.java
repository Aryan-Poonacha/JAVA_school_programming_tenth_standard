package Arrays;
import java.io.*;
class Deletion
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        int A[] = new int[11];
        for(int i = 0; i<11; i++)
        {
            System.out.println("Enter the next number: ");
            A[i] = Integer.parseInt(buffy.readLine());
        }
        
        System.out.println("Enter the number you wish to delete:");
        int no = Integer.parseInt(buffy.readLine());
        
        int temp = 0;
        
        for(int i = 0; i<11; i++)
        {
            if(A[i] == A[no])
            {
                temp = A[i];
                A[i] = A[i+1];