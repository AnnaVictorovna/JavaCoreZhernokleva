package hometasks.lesson13.b2;

import hometasks.appendix.Versh;
import hometasks.lesson13.b1.Converter;

public class Run {
    public static void main(String[] args) {
        Converter.convertStringToCollectionOfWords(Versh.versh).stream().sorted().forEach(System.out::println);
    }

}
/*Создайте класс Run и в методе main напишите код, который сортирует
коллекцию слов. Выведите результат в консоль.*/