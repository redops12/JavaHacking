import javax.swing.*;
import BreezySwing.*;

public class ConverterApplet extends GBApplet{

   JLabel degreesFahrenheitLabel = addLabel ("Degrees Fahrenheit",1,1,1,1);
   IntegerField degreesFahrenheitField = addIntegerField (0,1,2,1,1);
   JLabel degreesCentigradeLabel = addLabel ("Degrees Centigrade",2,1,1,1);
   IntegerField degreesCentigradeField = addIntegerField (0,2,2,1,1);
   JButton convertButton = addButton ("Convert",3,1,2,1);

   int fahrenheit;
   int centigrade;

   public void buttonClicked(JButton buttonObj){
      fahrenheit = degreesFahrenheitField.getNumber();
      centigrade = (fahrenheit  - 32) * 5 / 9;
      degreesCentigradeField.setNumber (centigrade);
    }
}


