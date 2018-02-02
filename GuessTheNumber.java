import java.util.Scanner;
class GuessTheNumber {
     static void main() {
         Scanner scn = new Scanner(System.in);
         System.out.println("Easy (0), Medium (1), Hard (2), impossible(3)?"); 
         int challenge = scn.nextInt();
         if (challenge > 3)
            challenge = 3;
         else if (challenge < 0)
            challenge = 0;
         System.out.println("Max: ");
         int max = scn.nextInt();
         System.out.println("Min: ");
         int min = scn.nextInt();
         int num = (int)(Math.random()*(max-min))+min;
         int guess = -1;
         int highbound = max;
         int lowbound = min;
         int gusses = 0;
         int i = 0;
         if (challenge == 0)
            gusses = (int) (1.5*(Math.log((max-min))/(Math.log(2))));
         if (challenge == 1)
            gusses = (int) (1.2*(Math.log((max-min))/(Math.log(2))));
         if (challenge == 2)
            gusses = (int) (1.0*(Math.log((max-min))/(Math.log(2))));
         if (challenge == 3)
            gusses = (int) (0.75*(Math.log((max-min))/(Math.log(2))));
         while (num != guess && i < gusses) {
             i++;
             System.out.println("Guess "+i+", " + (gusses-i+1) + " remaining (" + lowbound + "," + highbound + "): ");
             guess = scn.nextInt();
             if (guess > num){
                System.out.println("Too high");   
                highbound = guess;
             } 
             if (guess < num){
                System.out.println("Too Low"); 
                lowbound = guess;
             }
         }
         if (num != guess)
            System.out.println("The number was " + num + ". Better luck next time");
         else
            System.out.println("You got it");
     }
}