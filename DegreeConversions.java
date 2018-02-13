import java.util.Scanner;
import javax.swing.JOptionPane;
public class DegreeConversions
{
    static void main(){
        JOptionPane jpane = new JOptionPane();
        Ask q = new Ask();
        String answer = jpane.showInputDialog("Celsius or Fareheit starting(0 for Celsius and 1 for ferenheit)");
        float temp = q.askFloat("Temp");
        if (answer.equals("0")){
            System.out.println(f(temp) + " Fº");
        } else{
            System.out.println(c(temp) + " Cº");
        }
    }
    
    static private double f(float temp) {
        return ((temp*1.8)+32.0);
    }
    
    static private double c(float temp) {
        return ((temp-32)/1.8);
    }
}
