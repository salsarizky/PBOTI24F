package src;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

  
  public static void main(String[] args) {

    FileWriter f;

    try{
      f = new FileWriter("hellow.txt");
      f.write("Hello P Kabar? ");
      f.write(" Belajar File Handling ");
      f.write(" Belajar GUI ");
      f.close();
    } catch(IOException e){
      System.out.println(e.getMessage());
    }
  }  
}