import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;

class Gui extends Canvas{
    private JPanel window = new JPanel();
    public static void main(String[] args){
        JFrame frame = new JFrame("Swing!");
        frame.setPreferredSize(new Dimension(256, 144));
        Gui main = new Gui();
        JButton button = new JButton("button1");
        frame.getContentPane().add(main.window);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBounds(0,0,100,50);
    }
}     