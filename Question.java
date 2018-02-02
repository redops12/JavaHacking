import java.util.Scanner;
class Question{
    Scanner scn = new Scanner(System.in);
    public int askInt(String question) {
        System.out.print(question + "\t");
        int x = scn.nextInt();
        scn.nextLine();
        return x;
    }
    
    public char askChar(String question) {
        System.out.print(question + "\t");
        String x = scn.nextLine();
        char y = x.toLowerCase().charAt(0);
        return y;
    }
    
    public String ask(String question) {
        System.out.print(question + "\t");
        String x = scn.nextLine();
        return x;
    }
    
    public float askFloat(String question) {
        System.out.print(question + "\t");
        float x = scn.nextFloat();
        scn.nextLine();
        return x;
    }
}   