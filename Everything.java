import java.io.*;
class Everything
{
    public int wheat, carrot, cannabis;
    public int gold = 100;
    public int ownswheat, ownscarrot, ownscannabis = 0;
    public int ownsone = 0;
    
    public void Display() throws IOException
    {
        Everything obj = new Everything();
        
        System.out.println("You return home.");
        System.out.println("You have " + obj.wheat + " wheat.");
        System.out.println("You have " + obj.carrot + " carrots.");
        System.out.println("You have " + obj.cannabis +  " cannabis leaves.");
        System.out.println("You have " + obj.gold + " gold.");
        System.out.println();
        
        if(obj.gold == 10000)
        {
            System.out.println("Congratulations! You won!");
         }
        obj.Go();
    }

    public void Go()throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println("Press 1 to go to your farm.");
        System.out.println("Press 2 to go to the shop.");
        System.out.println();
        int choice1 = Integer.parseInt(buffy.readLine());
        
        switch(choice1)
        {
            case 1:
            if(obj.ownsone == 0)
            {
                System.out.println("You don't have any crops yet. Taking you to the shop.");
                obj.Shop();
            }
            if(obj.ownsone!=0)
            {
                System.out.println("Press 1 to go to the wheat field.");
                System.out.println("Press 2 to go to the carrot crops.");
                System.out.println("Press 3 to go the cannabis plantations.");
                int choice2 = Integer.parseInt(buffy.readLine());
                if((obj.ownswheat == 1) && (choice2 == 1))
                {
                    obj.Wheat();
                }
                else if((obj.ownscarrot == 1) && (choice2 == 2))
                {
                    obj.Carrot();
                }
                else if((obj.ownscannabis == 1) && (choice2 == 3))
                {
                    obj.Cannabis();
                }
            }
            break;
            
            case 2:
            obj.Shop();
            break;
        }
    }
    
    public void Shop() throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println(" \"Welcome to the shop!\"");
        System.out.println("\"Would you like to buy or sell?\"");
        System.out.println("Press 1 to buy farms.");
        System.out.println("Press 2 to sell crops.");
        int choice1 = Integer.parseInt(buffy.readLine());
        
        switch(choice1)
        {
            case 1:
            System.out.println("\"Would you like to add carrots, wheat or cannabis to your farm?\"");
            System.out.println("Press 1 to buy a wheat field (Cost: 50 gold.)");
            System.out.println("Press 2 to buy a carrot field (Cost: 500 gold.)");
            System.out.println("Press 3 to buy a cannabis field!(Cost: 1500 gold.)");
            int choice2 = Integer.parseInt(buffy.readLine());
            
            if(choice2 == 1)
            {
                obj.ownswheat = 1;
                obj.ownsone = 1;
                obj.gold -= 50;
                System.out.println("\"Congratulations! You now own a wheat field.\"");
                obj.Display();
            }
            else if(choice2 == 2)
            {
                obj.ownscarrot = 1;
                obj.ownsone = 1;
                obj.gold = obj.gold - 500;
                System.out.println("\"Congratulations! You now own a carrot farm.\"");
                obj.Display();
            }
            else if(choice2 == 3)
            {
                obj.ownscannabis = 1;
                obj.ownsone = 1;
                obj.gold = obj.gold - 1500;
                System.out.println("\"Congratulations! You now own a cannabis plantation. GL with that.\"");
                obj.Display();
            }
            break;
            
            case 2:
            System.out.println("\"What would you like to sell?\"");
            System.out.println("Press 1 to sell wheat(1 wheat = 2 gold)");
            System.out.println("Press 2 to sell carrots(1 carrot = 5 gold)");
            System.out.println("Press 3 to sell cannabis leaves.(1 leaf = 25 gold.");
            int choice3 = Integer.parseInt(buffy.readLine());
            
            if(choice3 == 1)
            {
                System.out.println("Enter how much wheat you would like to sell.");
                int wheatsold = Integer.parseInt(buffy.readLine());
                obj.wheat = obj.wheat - wheatsold;
                obj.gold += wheatsold*2;
                System.out.println("Transaction complete! You earned " + (wheatsold*2) + " gold.");
                obj.Display();
            }
            else if(choice3 == 2)
            {
                System.out.println("Enter how many carrots you would like to sell.");
                int carrotsold = Integer.parseInt(buffy.readLine());
                obj.carrot = obj.carrot - carrotsold;
                obj.gold += carrotsold*5;
                System.out.println("Transaction complete! You earned " + (carrotsold*5) + " gold.");
                obj.Display();
            }
            else if(choice3 == 3)
            {
                System.out.println("Enter how many cannabis leaves you would like to sell.");
                int wheatsold = Integer.parseInt(buffy.readLine());
                obj.wheat = obj.wheat - wheatsold;
                obj.gold += wheatsold*2;
                System.out.println("Transaction complete! You earned " + (wheatsold*2) + " gold.");
                obj.Display();
            }
            break;
        }
    }
    
    public void Wheat()throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println("You are now at the wheat field.");
        System.out.println("Press 1 to harvest the crop.");
        int choice1 = Integer.parseInt(buffy.readLine());
        
        if(choice1 == 1)
        {
            obj.Harvest("wheat");
            obj.Display();
        }
    }
    
    public void Carrot()throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println("You are now at the carrot farm.");
        System.out.println("Press 1 to harvest the crop.");
        int choice1 = Integer.parseInt(buffy.readLine());
        
        if(choice1 == 1)
        {
            obj.Harvest("carrot");
            obj.Display();
        }
    }
    
    public void Cannabis()throws IOException
    {
        BufferedReader buffy = new BufferedReader(new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println("You are now at the cannabis plantation.");
        System.out.println("Press 1 to harvest the stuff.");
        int choice1 = Integer.parseInt(buffy.readLine());
        
        if(choice1 == 1)
        {
            obj.Harvest("cannabis");
            obj.Display();
        }
    }
    
    public void Harvest(String crop)throws IOException
    {
        BufferedReader buffy = new BufferedReader (new InputStreamReader (System.in));
        Everything obj = new Everything();
        
        System.out.println("For a successful harvest, please type in as quickly as you can the text(s) that appears below:- ");
        
        if(crop == "wheat")
        {
           String combo = "";
           int random =(int)(Math.random()*10);
           if(random == 0)
            {
                random = 1;
            }
           if(random == 1)
           {
               combo = "qqqr";
           }
           else if(random == 2)
           {
               combo = "wwwr";
           }
           else if(random == 3)
           {
               combo = "eeer";
           }
           else if(random == 4)
           {
               combo = "qqwr";
           }
           else if(random == 5)
           {
               combo = "qqer";
           }
           else if(random == 6)
           {
               combo = "wwqr";
           }
           else if(random == 7)
           {
               combo = "wwer";
           }
           else if(random == 8)
           {
               combo = "eeqr";
           }
           else if(random == 9)
           {
               combo = "eewr";
           }
           else if(random == 10)
           {
               combo = "qwer";
           }
           System.out.println(combo);
           String comboinput = buffy.readLine();
           if(comboinput == combo)
           {
               int wheatharvested =(int)(Math.random()*10);
               obj.wheat += wheatharvested;
               System.out.println();
               System.out.println("Congratulations!");
               System.out.println("You harvested " + wheatharvested + " wheat.");
           }
        }
        
        else if(crop == "carrot")
        {
          int correctcombos = 0;
          for(int counter = 0; counter <=3; counter++)
          {
            String combo = "";
            int random =(int)(Math.random()*10);
            if(random == 0)
            {
                random = 1;
            }
            if(random == 1)
            {
               combo = "qqqr";
            }
            else if(random == 2)
            {
               combo = "wwwr";
            }
            else if(random == 3)
            {
               combo = "eeer";
            }
            else if(random == 4)
            {
               combo = "qqwr";
            }
            else if(random == 5)
            {
               combo = "qqer";
            }
            else if(random == 6)
            {
               combo = "wwqr";
            }
            else if(random == 7)
            {
               combo = "wwer";
            }
            else if(random == 8)
            {
               combo = "eeqr";
            }
            else if(random == 9)
            {
               combo = "eewr";
            }
            else if(random == 10)
            {
               combo = "qwer";
            }
            System.out.println(combo);
            String comboinput = buffy.readLine();
            if(comboinput == combo)
              {
                  correctcombos += 1;
              }
            if(correctcombos == 3)
            {
               int carrotharvested =(int)(Math.random()*25);
               obj.carrot += carrotharvested;
               System.out.println();
               System.out.println("Congratulations!");
               System.out.println("You harvested " + carrotharvested + " carrots.");
              }
          }
        }
        
        else if(crop == "cannabis")
        {
            int correctcombos = 0;
          for(int counter = 0; counter <=10; counter++)
          {
            String combo = "";
            int random =(int)(Math.random()*10);
            if(random == 0)
            {
                random = 1;
            }
            if(random == 1)
            {
               combo = "qqqr";
            }
            else if(random == 2)
            {
               combo = "wwwr";
            }
            else if(random == 3)
            {
               combo = "eeer";
            }
            else if(random == 4)
            {
               combo = "qqwr";
            }
            else if(random == 5)
            {
               combo = "qqer";
            }
            else if(random == 6)
            {
               combo = "wwqr";
            }
            else if(random == 7)
            {
               combo = "wwer";
            }
            else if(random == 8)
            {
               combo = "eeqr";
            }
            else if(random == 9)
            {
               combo = "eewr";
            }
            else if(random == 10)
            {
               combo = "qwer";
            }
            System.out.println(combo);
            String comboinput = buffy.readLine();
            if(comboinput == combo)
              {
                  correctcombos += 1;
              }
            if(correctcombos == 10)
            {
               int cannabisharvested =(int)(Math.random()*25);
               obj.cannabis += cannabisharvested;
               System.out.println();
               System.out.println("Congratulations!");
               System.out.println("You harvested " + cannabisharvested + " cannabis leaves.");
              }
          }
        }
    }
    
    public static void main(String args[]) throws IOException
    {
        
        Everything obj = new Everything();
        BufferedReader Biff = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Welcome to A&V OS!");
        System.out.println("The most advanced Operating System!");
        System.out.println("Perfect mix of multimedia and ergonomics!");
        System.out.println("1. Farmville - Escape to the world of farming, friends and fun! Go on farm adventures to collect rare goods and grow your farm");
        System.out.println("2. Calculator");
        System.out.println("3. Daywatch - Determines the day on any date provided from 1700 to 2699");
        int choice1 = Integer.parseInt(Biff.readLine());
        if(choice1 == 1)
        {
           System.out.println("Welcome to this game thing!");
           System.out.println("Disclaimer:");
           System.out.println("Always input only one of the available options.");
        
           System.out.println("Welcome!");
           System.out.println("You're a farmer now.");
           System.out.println("Your objective is to obtain 10,000 gold and retire.");
           System.out.println("Go farm.");
           obj.Display();
        }
        else if(choice1 == 2)
        {
            System.out.println("A. Mathematical Calculator");
                System.out.println("B. Scientific Calculator");
                System.out.println("Please enter your choice");
                char CH=(char)(Biff.read());
                if(CH=='A')
                {
                    System.out.println("a. Add");
                    System.out.println("b. Subtract");
                    System.out.println("c. Multiply");
                    System.out.println("d. Divide");
                    System.out.println("Please Enter Your Choice");
                    char cH=(char)(Biff.read());
                    switch(cH)
                    {
                        case 'a':
                        {
                           System.out.println("Please Enter the Two Values");
                           double a=Double.parseDouble((Biff.readLine()));
                           double b=Double.parseDouble((Biff.readLine()));
                    
                            double c=a+b;
                            System.out.println("Sum = "+c);
                            break;
                        }
                        case 'b':
                        {
                          System.out.println("Please Enter the Two Values");
                           double a=Double.parseDouble((Biff.readLine()));
                           double b=Double.parseDouble((Biff.readLine()));
                    
                            double c=a-b;
                            System.out.println("Difference = "+c);
                            break;
                        }
                        case 'c':
                        {
                           System.out.println("Please Enter the Two Values");
                           double a=Double.parseDouble((Biff.readLine()));
                           double b=Double.parseDouble((Biff.readLine()));
                    
                            double c=a*b;
                            System.out.println("Product = "+c);
                            break;
                        }
                        case 'd':
                        {
                             System.out.println("Please Enter the Two Values");
                           double a=Double.parseDouble((Biff.readLine()));
                           double b=Double.parseDouble((Biff.readLine()));
                    
                            double c=a/b;
                            System.out.println("Quotient = "+c);
                            break;
                        }
                        default:
                        {
                            System.out.println("Please rerun the program and enter a valid choice");
                        }
                    }
                }
                if(CH=='B')
                {
                    System.out.println("a. Sine");
                    System.out.println("b. Cosine");
                    System.out.println("c. Tangent");
                    System.out.println("d. Cosecant");
                    System.out.println("e. Secant");
                    System.out.println("f. Cotangent");
                    System.out.println("Please Enter Your Choice");
                    char Ch=(char)(Biff.read());
                    System.out.println("Please Enter a Value");
                    double d=Double.parseDouble((Biff.readLine()));
                    switch(Ch)
                    {
                        case 'a':
                        {
                            double e=Math.sin(d);
                            System.out.println("Sine of "+d+" is "+e);
                        }
                        case 'b':
                        {
                            double e=Math.cos(d);
                            System.out.println("Cosine of "+d+" is "+e);
                        }
                        case 'c':
                        {
                            double e=Math.tan(d);
                            System.out.println("Tangent of "+d+" is "+e);
                        }
                        case 'd':
                        {
                            double e=1/(Math.sin(d));
                            System.out.println("Cosecant of "+d+" is "+e);
                        }
                        case 'e':
                        {
                            double e=1/(Math.cos(d));
                            System.out.println("Secant of "+d+" is "+e);
                        }
                        case 'f':
                        {
                            double e=1/(Math.tan(d));
                            System.out.println("Cotangent of "+d+" is "+e);
                        }
                        default:
                        {
                            System.out.println("Please rerun the program and enter a valid choice");
                        }
                    }
                }
            }
            else if(choice1 == 3)
            {
                 System.out.println("Enter the Year");
                int year=Integer.parseInt(Biff.readLine());
                System.out.println("Enter the last two digits of the year");
                int yea=Integer.parseInt(Biff.readLine());                
                System.out.println("Enter the Month");
                String month=Biff.readLine();
                System.out.println("Enter the day");
                String day=Biff.readLine();
                int y=0;
                int m=0;
                if((year>=1700)&&(year<=1799))
                {
                    y=4;
                }
                if((year>=1800)&&(year<=1899))
                {
                    y=2;
                }
                if((year>=1900)&&(year<=1999))
                {
                    y=0;
                }
                if((year>=2000)&&(year<=2099))
                {
                    y=6;
                }
                if((year>=2100)&&(year<=2199))
                {
                    y=4;
                }
                if((year>=2200)&&(year<=2299))
                {
                    y=2;
                }
                if((year>=2300)&&(year<=2399))
                {
                    y=0;
                }
                if((year>=2400)&&(year<=2499))
                {
                    y=6;
                }
                if((year>=2500)&&(year<=2599))
                {
                    y=4;
                }
                if((year>=2600)&&(year<=2699))
                {
                    y=2;
                }
                int r=yea/4;
                if((month=="January")||(month=="October"))
                {
                    m=0;
                }
                if((month=="February")||(month=="March")||(month=="November"))
                {
                    m=3;
                }
                if((month=="April")||(month=="July"))
                {
                    m=6;
                }
                if(month=="May")
                {
                    m=1;
                }
                if(month=="June")
                {
                    m=4;
                }
                if(month=="August")
                {
                    m=2;
                }
                if((month=="September")||(month=="December"))
                {
                    m=5;
                }
                int s=y+yea+r+m;
                double q=s%7;
                if(q==0)
                {
                    System.out.println("The day was Sunday");
                }
                if(q==1)
                {
                    System.out.println("The day was Monday");
                }
                if(q==2)
                {
                    System.out.println("The day was Tuesday");
                }
                if(q==3)
                {
                    System.out.println("The day was Wednesday");
                }
                if(q==4)
                {
                    System.out.println("The day was Thursday");
                }
                if(q==5)
                {
                    System.out.println("The day was Friday");
                }
                if(q==6)
                {
                    System.out.println("The day was Saturday");
                }
            }
        }
    }