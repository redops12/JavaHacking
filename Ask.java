import java.util.Scanner;
class Ask{
    Scanner scn = new Scanner(System.in);
    // public int askInt(String question) {
        // System.out.print(question + "\t");
        // int x = scn.nextInt();
        // scn.nextLine();
        // return x;
    // }
    
    // public char askChar(String question) {
        // System.out.print(question + "\t");
        // String x = scn.nextLine();
        // char y = x.toLowerCase().charAt(0);
        // return y;
    // }
    
    // public String ask(String question) {
        // System.out.print(question + "\t");
        // String x = scn.nextLine();
        // return x;
    // }
    
    // public float askFloat(String question) {
        // System.out.print(question + "\t");
        // float x = scn.nextFloat();
        // scn.nextLine();
        // return x;
    // }
    
    // public void say(String statement){
        // System.out.println(statement);
    // }
    
    public static int askInt(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        int x = scn.nextInt();
        scn.nextLine();
        return x;
    }
    
    public static char askChar(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        String x = scn.nextLine();
        char y = x.toLowerCase().charAt(0);
        return y;
    }
    
    public static String ask(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        String x = scn.nextLine();
        return x;
    }
    
    public static double askDouble(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        float x = scn.nextFloat();
        scn.nextLine();
        return x;
    }
    
    public static void say(String statement){
        System.out.println(statement);
    }
}   