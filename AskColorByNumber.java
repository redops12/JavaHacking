import java.util.Scanner;

public class AskColorByNumber
{

    static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Pick a number corresponding to a color");
        System.out.println("1)\tRed");
        System.out.println("2)\tBlue");
        System.out.println("3)\tGreen");
        System.out.println("4)\tPurple");
        System.out.println("5)\tGold");
        int x = scn.nextInt();
        String[] colors = {"wrong", "Red","Blue","Green","Purple","Gold","wrong"};
        String y = colors[x];
        System.out.println("you picked " + y);
        switch(y.toLowerCase()){
            case "red":
                System.out.println("Red Sucks"); 
                break;
            case "blue":
                System.out.println("Blue Sucks");
                break;
            case "green":
                System.out.println("Do you also like gold? (bool)");
                String l = scn.nextLine();
                if (l.equals("yes")){
                    System.out.println("You're alright");
                } else{
                    System.out.println("you suck");   
                }
                break;
            case "purple":
                System.out.println("Purple Really Sucks");
                break;
            case "gold":
                System.out.println("Do you also like green?(bool)");
                boolean a = scn.nextBoolean();
                if (a){
                    System.out.println("You're alright");
                } else{
                    System.out.println("you suck");  
                }
            case "wrong":
            default:
                System.out.println("you suck at reading");
        }
    }  
}
