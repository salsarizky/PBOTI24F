package src;
import java.io.File;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    try {
  
      File f = new File("hellow.txt");

      Scanner r = new Scanner(f);

      while(r.hasNextLine()) {
        String data = r.nextLine();
        System.out.println(data);
      }

      r.close();
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
  }
}