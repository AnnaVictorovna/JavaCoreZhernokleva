package hometasks.lesson12.b2;

import hometasks.lesson12.b1.Run;

public class Runn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        ReaderAndConsolePrinter.readText(Run.FILE_PATH);
        long l = System.nanoTime() - start;


        long startBuf = System.nanoTime();
        ReaderAndConsolePrinter.readText(Run.BUF_FILE_PATH);
        long lBuf = System.nanoTime() - startBuf;

        System.out.println("SPEED OF 1 METHOD IS " + l);
        System.out.println("SPEED OF 2 METHOD IS " + lBuf);
    }
}
/*Напишите метод, который берёт стихотворение из файла versh.txt и
выводит его в консоль. Напишите метод, который берёт стихотворение
из файла bufVersh.txt и выводит его в консоль. Создайте класс Run
и в методе main проверьте скорость работы двух методов.*/
