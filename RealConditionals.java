import java.util.Scanner;
class RealConditionals {
   static Scanner scn = new Scanner(System.in);
   public static void Hr7_Burke_Set2_1() {
       System.out.print("Name: ");
       String name = scn.nextLine();
       System.out.print("Age: ");
       int x = scn.nextInt();
       if (x>=16)
          System.out.println("You, " + name + ", are able to drive");
       else
          System.out.println("You have " + (16-x) + " more years till you can drive");
   }
    
   public static void Hr7_Burke_Set2_2() {
       System.out.println("Telegrams: ");
       int x = scn.nextInt();
       System.out.print("Cost: ");
       if (x<=15) 
            System.out.print("8.50");
       else if(x>15)
            System.out.print((8.5+(0.25*(x-15))));
   }
   
   public static void Hr7_Burke_Set2_3() {
       System.out.println("First Int: ");
       int x = scn.nextInt();
       System.out.println("Second Int: ");
       int y = scn.nextInt();
       if (x>y)
            System.out.println(x + " is greater than " + y);
       if (y>x)
            System.out.println(y + " is greater than " + x);
       if (x==y)
            System.out.println("They are equal");
   }
   
   public static void Hr7_Burke_Set2_4() {
       System.out.println("Age: ");
       int x = scn.nextInt();
       System.out.print("Cost: ");
       if (x<5)
            System.out.println("free");
       else if (x>=65)
            System.out.println("1.50");
       else
            System.out.println("2.50");
   }
   
   public static void Hr7_Burke_Set2_5() {
       System.out.println("Positive int: ");
       int x = scn.nextInt();
       if ((x%2)==0)
            System.out.println("even");
       else
            System.out.println("odd");
   }
}
