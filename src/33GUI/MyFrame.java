import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame {

  MyFrame() {
    // JFrame frame = new JFrame();
    this.setVisible(true);
    this.setTitle("JFrame");
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

    ImageIcon img = new ImageIcon("logo.jpg");
    this.setIconImage(img.getImage());

    this.getContentPane().setBackground(new Color(0x123456));
  }
}
