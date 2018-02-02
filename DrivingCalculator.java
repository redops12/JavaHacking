import java.util.Scanner;
import java.text.*;
public class DrivingCalculator
{
    static void main()
    {
        Scanner scn = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        double miles = 0;
        double gallons = 0;
        System.out.println("How many weeks is your road trip?");
        int weeks = scn.nextInt();
        for (int i = 0; i<weeks; i++) {
            System.out.println("Week " + (i+1));
            System.out.print("Miles(enter -99 to end): ");
            double milestemp = scn.nextDouble();
            if (milestemp == -99){
                System.exit(0);
            }
            miles = miles + milestemp;
            System.out.println("\t\t\t\t Vacation miles traveled total: " + miles);
            System.out.print("Gallons: ");
            double gallonstemp = scn.nextDouble();
            gallons = gallons + gallonstemp;
            System.out.println("\t\t\t\t Vacation gallons used total: " + gallons);
            System.out.print("MPG: " + format.format((milestemp/gallonstemp)));
            System.out.println("\t\t\t Vacation mpg total:" +  format.format((miles/gallons)));
        }
    }
}
