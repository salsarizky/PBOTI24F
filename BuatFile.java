package src;
import java.io.File;
import java.io.IOException;

public class BuatFile {

  public static void main(String args[]) {

    File f = new File("hallo.txt");
    // /mnt/c/Users/myPc/Documents/java/campus/sesi11/hallo.txt

    try {
     if(f.createNewFile()) {
      System.out.println("File Berhasil dibuat");
    } else {
      System.out.println("File Sudah Ada");
    } 
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}