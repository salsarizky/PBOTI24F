package src;
import java.io.File;

public class InformationFile {

  public static void main(String args[]) {


    try {
      File f = new File("hallo.txt");
      
      if(f.exists()) {
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getPath());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}