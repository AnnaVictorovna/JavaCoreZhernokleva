package hometasks.lesson13.b5;

import hometasks.appendix.Versh;
import hometasks.lesson13.b1.Converter;

import java.util.Objects;

public class Run {
    public static void main(String[] args) {
        String string = Converter.convertStringToCollectionOfWords(Versh.versh)
                .stream()
                .filter(s -> Objects.equals(s, "ў"))
                .toString();
        if (string != null) {
            System.out.println("есть \"ў\"");
        } else {
            System.out.println("няма \"ў\"");
        }
    }
}
/*Создайте класс Run и в методе main напишите код, который проверяет
есть ли в коллекции “ў”. Ответ выведите в консоль.*/