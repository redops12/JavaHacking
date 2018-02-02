import java.util.Scanner;
import java.text.*;
public class ComputerAbuse
{
    static void main() {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decConv = new DecimalFormat("0.00");
        System.out.println("Society for the Prevention of Cruelty to Computers");
        System.out.println("What is your name?");
        String name = scn.nextLine();
        System.out.println("What is the name of the offender?");
        String nameO = scn.nextLine();
        System.out.println("What Cruelty offense did you observe?\tHere are the Choices");
        System.out.println("1.Name calling at the computer.\t\t$49.95");
        System.out.println("2.Finger shaking at the computer.\t$99.95");
        System.out.println("3.Yelling loudly at the computer.\t$149.95");
        System.out.println("4.Physically attacking the computer.\t$499.95");
        int choice = scn.nextInt();
        double[] prices = {49.95,99.95,149.95,499.95};
        String[] choices = {"Name calling at the computer","Finger shaking at the computer","Yelling loudly at the computer","Physically attacking the computer"};
        if (choice<1 || choice >4){
            System.out.println("Not a choice try again");
        } else if (nameO.toLowerCase().equals("donald") && choice==4) {
            System.out.println("" + nameO + ", " + choices[choice-1] + ", $" + decConv.format(prices[choice-1]*1.45) + ", as reported by " + name);    
        } else if ((choice==3 || choice==4) && nameO.toLowerCase().equals("minnie") && nameO.toLowerCase().equals("mickey")){
            System.out.println("Fines over $100 cannot be issued against a spouse.");
        } else{ 
            System.out.println("" + nameO + ", " + choices[choice-1] + ", $" + decConv.format(prices[choice-1]) + ", as reported by " + name);
        }
        }
    }

