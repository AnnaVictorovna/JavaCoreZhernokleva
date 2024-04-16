package hometasks.lesson12.b1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterWithBuffer {
    public static void writeText(String text, String bufferPath) {
        try (Writer fileWriter = new FileWriter(bufferPath);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
