package src;
import javax.swing.JFrame;

public class FormLogin extends JFrame {
  
  public FormLogin() {
    // bisa langsung memanggil beberapa method di JFrame
    setTitle("Form Login");
    setSize(200, 400);

    setLocationRelativeTo(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    
    new FormLogin();
  }
}