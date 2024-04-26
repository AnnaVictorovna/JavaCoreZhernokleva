package hometasks.lesson13.b1;

import java.util.List;
import java.util.stream.Stream;

public class Converter {
    public static List<String> convertStringToCollectionOfWords(String text) {
        String[] wordsFromText = text.split("\\P{L}+");
        List<String> list = Stream.of(wordsFromText).toList();
        return list;
    }
}
/*Создать класс Converter в котором есть метод преобразующий
стихотворение из класса Versh в коллекцию слов. В коллекции слов не
должны присутствовать знаки препинания и пустые значения. Создайте
класс Run и в методе main напишите код который выведет в консоль
коллекцию слов в столбик*/