package hometasks.lesson12.b1;

import hometasks.lesson12.a1.Versh;

public class Run {
    public static final String FILE_PATH = "src/hometasks/lesson12/b1/versh.txt";
    public static final String BUF_FILE_PATH = "src/hometasks/lesson12/b1/bufVersh.txt";

    public static void main(String[] args) {
        long start = System.nanoTime();
        ReaderAndWriter.writeStringInFile(Versh.versh, FILE_PATH);
        long l = System.nanoTime() - start;
        System.out.println(l);
        long startBuf = System.nanoTime();
        ReaderAndWriter.writeStringInFile(Versh.versh, BUF_FILE_PATH);
        long lBuf = System.nanoTime() - startBuf;
        System.out.println(lBuf);
    }
}
/*Напишите метод, который берёт стихотворение из класса Versh и
записывает его в файл versh.txt в текущую папку задачи. Напишите
метод, который берёт стихотворение из класса Versh и записывает его
в файл bufVersh.txt в текущую папку задачи. Создайте класс Run и в
методе main проверьте скорость работы двух методов.*/
