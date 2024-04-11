package hometasks.lesson12.a;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Run {
    public static void main(String[] args) {
        writeStringInFile(Versh.versh, "F:\\Zhernokleva\\JavaCoreZhernokleva\\src\\hometasks\\lesson12\\a\\versh.txt");
    }

    private static void writeStringInFile(String text, String fileName) {
        try (Writer fileWriter = new FileWriter(fileName)) {
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*Создайте класс Run и в методе main напишите код, который берёт
стихотворение из класса Versh и записывает его в файл versh.txt.*/