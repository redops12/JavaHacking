import java.util.Scanner;

public class PiggyBank
{
    public static void MasterFunction(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Name:     "); //These lines get all the relevant information
        String name = scn.nextLine();
        System.out.print("\nPennies:  ");
        int p = scn.nextInt();
        System.out.print("\nNickles:  ");
        int n = scn.nextInt();
        System.out.print("\nDimes:    ");
        int d = scn.nextInt();
        System.out.print("\nQuarters: ");
        int q = scn.nextInt();
        System.out.println("\nWeeks you've been saving: ");
        int weeks = scn.nextInt();
        double money = (p*0.01)+(n*0.05)+(d*0.1)+(q*0.25); //Calculates total
        double mpw = Math.round((money/weeks)*100)/100.0; //calculates money per week and rounds it
        double mpy = Math.round(((money/weeks)*52)*100)/100.0;
        if ((money*100)%10==0) //checks if a zero should be appended on money for readability
            System.out.println(name + ", your total money is $" + money + "0"); //Prints total
        else 
            System.out.println(name + ", your total money is $" + money);
        if (mpw%10==0) //checks if a zero should be appended on dollars per week for readability
            System.out.println(name + ", you save roughly $" + mpw + "0 per week"); //Prints dollars per week
        else 
            System.out.println(name + ", you save roughly $" + mpw + " per week");
        if (mpy%10==0) //checks if a zero should be appended on dollars per week for readability
            System.out.println(name + ", you can save roughly $" + mpy + "0 in a year"); //Prints dollars per week
        else 
            System.out.println(name + ", you can save roughly $" + mpy + " in a year");
    }
}
