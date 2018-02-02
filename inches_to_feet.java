import java.util.Scanner;


public class inches_to_feet
{
    static Scanner scn = new Scanner(System.in);
    public static void Hr7_Burke_CodingSet_11() {
       System.out.print("how tall are you in inches (no units): ");
       int x = scn.nextInt();
       System.out.println("you are: " + (int) (x/12.0) + " ft " + x%12 + " in tall"); 
    }
    
    public static void Hr7_Burke_CodingSet_12() {
       System.out.print("Enter a value in puonds (no units): ");
       double x = scn.nextDouble();
       System.out.println(x*16.0 + " oz"); 
    }
    
    public static void Hr7_Burke_CodingSet_13() {
       System.out.print("How far do you drive from home to work in miles (no units): ");
       double x = scn.nextDouble();
       System.out.print("How many gallons of gas do you buy each week (no units): ");
       double y = scn.nextDouble();
       System.out.println("your gas mileage is: " + (x*10.0)/y + " mpg"); 
    }
    
    public static void Hr7_Burke_CodingSet_14() {
       int bond = 007;
       System.out.println("00" + bond + ": b0nd");
       System.out.println("00" + bond*10 + ": b0nd * 10");
       System.out.println(bond*bond*bond + ": b0nd^3");
    }
    
    public static void Hr7_Burke_CodingSet_15() {
        System.out.println("What's your name?");
        String x = scn.nextLine();
        System.out.println("What's your favorite color?");
        String y = scn.nextLine();
        System.out.println(x + ", have you ever thought of dying your hair " + y);
    }
}
