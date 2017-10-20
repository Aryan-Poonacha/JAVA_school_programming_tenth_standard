package Functions;
import java.io.*;
class Student
{
    String name;
    int engmarks,hindimarks;
    int avg;
    int mx;
    
    Student() //it should be Student(int x) because if not the constructor wil be called for the calls within other functions and reset all values to 0, but question doesn't askso stick to this
    {
        Student s = new Student();
        s.engmarks = 0;
        s.hindimarks = 0;
        s.name = "";
    }
    
    public void Accept() throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        Student s = new Student();
        s.engmarks = Integer.parseInt(buffy.readLine());
        s.hindimarks = Integer.parseInt(buffy.readLine());
        s.name = buffy.readLine();
    }
    
    public void Calc()
    {
        Student s = new Student();
        s.avg = (s.engmarks+s.hindimarks)/2;
        s.mx = Math.max(s.engmarks,s.hindimarks);
    }
    
    public void Print()
    {
        Student s = new Student();
        System.out.println("NAME =" + s.name);
        System.out.println("Eng:" + s.engmarks);
        System.out.println("Hindi:" + s.hindimarks);
        System.out.println("AVG = "+s.avg);
        System.out.println("MAX = "+s.mx);
    }
}
