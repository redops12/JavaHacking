import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HelloWorld
{
    Scanner input1 = new Scanner(System.in);
    public void Hi() {
        System.out.println("What's your name?");
        String x = input1.nextLine();
        System.out.println("Hello " + x);
        System.out.println("Pick a positive integer: ");
        double z = input1.nextDouble();
        System.out.println(primeFactor(z));
    }

    List<Integer> factors = new ArrayList<Integer>();
    private List<Integer> primeFactor(double x) {
        factors.clear();
        for (int i = 2; i <= x/2; i++){
            double tempx = x/i;
            if (tempx == (int)tempx) {
                factors.add(i);
                x = tempx;
                //System.out.println(x);
                i--;
            }
        }
        factors.add((int)x);
        return factors;
    }

    public static void main(String[] args) {
        HelloWorld hiThere = new HelloWorld();
        hiThere.Hi();

    }
}    