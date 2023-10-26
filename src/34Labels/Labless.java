import javax.swing.*;
import java.awt.*;

public class Labless{
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("logo2.jpg");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 400);

        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("How are you?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);

        label.setForeground(new Color(255,0,0));
        label.setFont(new Font("MV Boli",Font.PLAIN,30));

        frame.add(label);

    }
}