package hometasks.lesson10_1.b1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Run {
    public static String versh =
            "Трэба дома бываць часцей," +
                    "Трэба дома бываць не госцем," +
                    "Каб душою не ачарсцвець," +
                    "Каб не страціць святое штосьці.";

    public static void main(String[] args) {
        String[] newS = versh.split(" ");
        System.out.println(Arrays.toString(Arrays.stream(newS).toArray()));
        System.out.println(getNumbersCount(newS));
    }

    public static Map<String, Integer> getNumbersCount(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : words) {
            Integer current = result.get(string);
            if (current == null) {
                result.put(string, 1);
            } else {
                result.put(string, ++current);
            }

        }
        return result;
    }
}
/*Возьмите текст из класса Versh и подсчитайте частоту встречаемости
каждого слова. Создайте класс Run и в методе main выведите
результат подсчётов в формате: слово=частота.*/