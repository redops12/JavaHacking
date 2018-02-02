import java.util.Scanner;
import java.text.*;
public class Movie_Inventory
{
    static void main(){
        DecimalFormat decConv = new DecimalFormat("0.00");  
        Scanner scn = new Scanner(System.in);
        System.out.println("How much is WarGames?");
        double wgp = scn.nextDouble();
        System.out.println("How many WarGames does your store have?");
        int wgn = scn.nextInt();
        System.out.println("How much is Hidden Figures?");
        double hfp = scn.nextDouble();
        System.out.println("How many Hidden Figures does your store have?");
        int hfn = scn.nextInt();
        System.out.println("How much is Imitation Game?");
        double igp = scn.nextDouble();
        System.out.println("How many Imitation Games does your store have?");
        int ign = scn.nextInt();
        double total =(wgp*wgn)+(hfp*hfn)+(igp*ign);
        double avg = total/(wgn+hfn+ign);
        System.out.println("Video title\tCost\t# in Stock");
        System.out.println("WarGames\t" + decConv.format(wgp) + "\t" + wgn);
        System.out.println("WarGames\t" + decConv.format(hfp) + "\t" + hfn);
        System.out.println("WarGames\t" + decConv.format(igp) + "\t" + ign);
        System.out.println("total value: " + decConv.format(total));
        System.out.println("Average movie value: " + decConv.format(avg));
    }
}
