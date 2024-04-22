package hometasks.lesson12.b3;

public class Run {
    public static void main(String[] args) {
        WriterInFile.writeStringInFile("word");
        WriterInFile.writeStringInFile("zord");
        WriterInFile.writeStringInFile("lord");
        ReaderFromFile.readTex(WriterInFile.FILE_PATH);
    }
}
/*Напишите метод, который принимает на вход строку и записывает её в
файл в папке текущей задачи. Создайте класс Run и в методе main
напишите код, который передаёт в метод по одному слову (все слова
разные) для записи в файл. Считайте из созданного файла записанную
информацию и выведите её в консоль.*/