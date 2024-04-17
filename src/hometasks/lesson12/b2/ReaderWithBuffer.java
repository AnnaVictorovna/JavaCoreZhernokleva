package hometasks.lesson12.b2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWithBuffer {
    public static void readText(String filePath) {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
