package hometasks.lesson12.a2;

import hometasks.lesson12.a1.Run;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Runn {
    public static void main(String[] args) {
        readText(Run.FILE_PATH);
    }

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
/*Создайте класс Run и в методе main напишите код, который считывает
стихотворение из файла versh.txt и выводит его в консоль.*/