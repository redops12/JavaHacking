import java.util.Scanner;
import javax.swing.JOptionPane;
public class DistanceConversion
{
    static void main(){
        JOptionPane jpane = new JOptionPane();
        Ask q = new Ask();
        String answer = jpane.showInputDialog("Yards or Feet(0 for yards and 1 for feet)");
        float temp = q.askFloat("Distance");
        if (answer.equals("0")){
            System.out.println(y(temp) + " yds");
        } else{
            System.out.println(f(temp) + " ft");
        }
    }
    
    static private double y(float distance) {
        return (distance/3);
    }
    
    static private double f(float distance) {
        return (distance*3);
    }
}
