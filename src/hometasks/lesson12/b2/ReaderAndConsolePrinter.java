package hometasks.lesson12.b2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderAndConsolePrinter {
    public static void readText(String filePath) {
        try (Reader fileReader = new FileReader(filePath)) {
            int code;
            while ((code = fileReader.read()) != -1) {
                System.out.print(Character.toChars(code));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
