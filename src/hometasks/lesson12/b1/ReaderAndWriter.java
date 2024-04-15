package hometasks.lesson12.b1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReaderAndWriter {
    public static void writeStringInFile(String text, String fileName) {
        try (Writer fileWriter = new FileWriter(fileName)) {
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
