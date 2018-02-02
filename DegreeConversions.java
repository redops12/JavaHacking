import java.util.Scanner;
public class DegreeConversions
{
    static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Celsius or Fareheit starting(0 for Celsius and 1 for ferenheit): ");
        int answer = scn.nextInt();
        System.out.println("Temp: ");
        int temp = scn.nextInt();
        if (answer == 0){
            System.out.println(((temp*1.8)+32) + " Fº");
        } else{
            System.out.println(((temp-32)/1.8) + " Cº");
        }
    }
}
