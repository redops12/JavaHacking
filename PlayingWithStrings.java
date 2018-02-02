import java.util.Scanner;

public class PlayingWithStrings
{
    public static void MasterFunction(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Last name: ");
        String lName = scn.nextLine();
        System.out.println(lName + "@Camelot.com");
        
        String person = "King Arthur";
        for (int i = 1; i<3; i++){
            System.out.println(person);
            person = "Guinevere";
        }
        
        System.out.println("Type in <city>,>state>,<zip>: ");
        String info = scn.nextLine();
        System.out.println("Length of city: " + info.indexOf(","));
        
        String one = "Pendragon, Uther";
        System.out.println(one.substring(one.indexOf(", ")+2) + " " + one.substring(0,(one.indexOf(", "))));
        
        System.out.println("Caption: ");
        String caption = scn.nextLine();
        System.out.println("Your caption is: " +  caption);
        System.out.println("Your caption length is: " +  caption.length());
        System.out.println("The character at the fourth letter of your caption is: " +  caption.charAt(3));
    }
}
