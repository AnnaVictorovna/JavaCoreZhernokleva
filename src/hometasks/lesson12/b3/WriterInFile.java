package hometasks.lesson12.b3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterInFile {
    public static final String FILE_PATH = "F:\\Zhernokleva\\JavaCoreZhernokleva\\src\\hometasks\\lesson12\\b3\\file";

    public static void writeStringInFile(String text) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH, true));) {
            for (int i = 0; i < text.length(); i++) {
                out.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
