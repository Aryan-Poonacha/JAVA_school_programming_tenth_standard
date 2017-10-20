package Worksheet_2;
import java.io.*;
class Population
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
                int male = 0;
                int female = 0;
                int child = 0;
for(int i = 0; i<=300; i++)
{
    System.out.println("Enter 0 for male, 1 for female, 2 for child:");
    int choice = Integer.parseInt(buffy.readLine());
    switch(choice)
    {
        case 0:
        male = male + 1;
        break;
        case 1:
        female = female +1;
        break;
        case 2:
        child = child +1;
        break;
        default:
        System.out.println("Incorrect choice.");
        continue;
    }
}
System.out.println("Number of males: " + male);
System.out.println("Number of females: " +female);
System.out.println("Number of children: " +child);
}
}