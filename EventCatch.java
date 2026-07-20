package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventCatch implements ActionListener {

  static JButton b0;
  static JButton b1;
  static JButton b2;
  static JButton b3;
  static JTextField t1;
  static String teks = "";
      
  public void FormKalkulator() { // Listener: Interface
    JFrame f = new JFrame("Belajar Event");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JTextField t1 = new JTextField();

    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    
    JButton b4 = new JButton("4");

    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    p1.add(t1, BorderLayout.NORTH);
    p2.setLayout(new GridLayout(2, 2, 5, 5));
    p2.add(b0);
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);

    f.setLayout(new FlowLayout());
    f.add(p1);
    f.add(p2);
    f.setSize(400, 400);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    
    EventCatch ec = new EventCatch();
    ec.FormKalkulator();
  }  

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == b1) {
      teks += "1";
    } else if (e.getSource()==b2){
      teks += "2";
    } else if (e.getSource()==b3){
      teks += "2";
    } else if (e.getSource()==b0){
      teks += "0";
    }
  }
}