package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Border {

  public static void main(String[] args) {
    
    JFrame f = new JFrame("Latihan Border Layout");
    f.setSize(200, 400);

    JButton b1 = new JButton("Utara");
    JButton b2 = new JButton("Selatan");
    JButton b3 = new JButton("Timur");
    JButton b4 = new JButton("Barat");
    JButton b5 = new JButton("Tengah");

    f.add(b1, BorderLayout.NORTH);
    f.add(b2, BorderLayout.SOUTH);
    f.add(b3, BorderLayout.EAST);
    f.add(b4, BorderLayout.WEST);
    f.add(b5, BorderLayout.CENTER);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }
}