package hometasks.lesson13.b3;

import hometasks.appendix.Versh;
import hometasks.lesson13.b1.Converter;

import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        Converter.convertStringToCollectionOfWords(Versh.versh)
                .stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
/*Создайте класс Run и в методе main напишите код, который удаляет из
коллекции слов все дубликаты. Выведите результат в консоль.*/