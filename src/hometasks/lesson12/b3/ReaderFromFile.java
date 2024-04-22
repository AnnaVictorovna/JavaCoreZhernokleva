package hometasks.lesson12.b3;

import java.io.*;

public class ReaderFromFile {

    public static void readTex(String path) {
        try {
            Reader fileReader = new FileReader(path);
            int code;
            while ((code = fileReader.read()) != -1) {
                System.out.print(Character.toChars(code));
            }
            Writer fileWriter = new FileWriter(path);
            fileWriter.write("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}