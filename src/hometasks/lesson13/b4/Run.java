package hometasks.lesson13.b4;

import hometasks.appendix.Versh;
import hometasks.lesson13.b1.Converter;

import java.util.Optional;

public class Run {
    public static void main(String[] args) {
        Optional<String> longest = Converter.convertStringToCollectionOfWords(Versh.versh).stream()
                .reduce((s1, s2) -> {
                    if (s1.length() > s2.length())
                        return s1;
                    else
                        return s2;
                });
        System.out.println(longest);
    }
}
/*Создайте класс Run и в методе main напишите код, который находит
самое длинное слово из стихотворения в классе Versh, выведите это
слово в консоль.*/