package hometasks.lesson12.b3;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderFromFile {

    public static void readTex(String path) {
        try {
            Reader fileReader = new FileReader(path);
            int code;
            while ((code = fileReader.read()) != -1) {
                System.out.print(Character.toChars(code));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}