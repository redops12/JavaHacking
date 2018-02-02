import java.util.Scanner;
public class area
{
   static void main (){
       Scanner scn = new Scanner(System.in);
       String x = "y";
       while (x.toLowerCase().equals("y")) {
           x = "y";
           double input = -1;
           while (Math.abs(input)!=input){
               System.out.println("Enter the radius of a circle and I'll find the area: ");
               input = scn.nextDouble();
               scn.nextLine();
               if (Math.abs(input)!=input){
                  System.out.println("That's not positive. Try again!");
               } else {
                  System.out.println("The area is: " + (3.14*input*input));
               }
           }
           System.out.println("If you want to run again enter 'y'");
           x = scn.nextLine();
        } 
       System.out.println("" + x);
   }
}
