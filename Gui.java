import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;

class Gui extends Canvas{
    private JPanel window = new JPanel();
    private JButton button1;
    int buttonWidth = 100;
    int buttonHeight = 50;
    public static void main(String[] args){
        JFrame frame = new JFrame("Swing!");
        frame.setPreferredSize(new Dimension(256, 144));
        Gui main = new Gui();
        Gui.drawButtons();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    static private void drawButton(String name, JButton button, int x, int y, int width = buttonWidth, int height = buttonHeight) {
        button1 = new JButton("button1");
        button1.setBounds(50,25,100,50);
        window.add(button1);
    }
}     