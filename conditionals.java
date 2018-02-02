import java.util.Scanner;
class conditionals {
   static Scanner scn = new Scanner(System.in);
   public static void Hr7_Burke_Set3_1() {
       System.out.print("Number of players: ");
       int x = scn.nextInt();
       int y = x%7;
       int teams = (int) (x/7);
       System.out.println("There will be" + teams + "teams with" + y + "players left over.");
   }
    
   public static void Hr7_Burke_Set3_2() {
       System.out.print("Two digit integer: ");
       int x = scn.nextInt();
       int y = x%10;
       int teams = (int) (x/10);
       System.out.println("First digit: " + teams);
       System.out.println("Second digit: " + y);
       System.out.println("Sum: " + (teams+y));
   }
   
   public static void Hr7_Burke_Set3_3() {
       System.out.print("Three digit integer: ");
       int x = scn.nextInt();
       int y = (int) ((x%100)/10);
       int teams = (int) (x/100);
       int z = x%10;
       System.out.println("First digit: " + teams);
       System.out.println("Second digit: " + y);
       System.out.println("Third digit: " + z);
       System.out.println("Sum: " + (teams+y+z));
   }
}
