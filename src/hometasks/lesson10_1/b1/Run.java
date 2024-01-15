package hometasks.lesson10_1.b1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Run {
    public static String versh =
            "Трэба дома бываць часцей,\n" +
                    "Трэба дома бываць не госцем,\n" +
                    "Каб душою не ачарсцвець,\n" +
                    "Каб не страціць святое штосьці.\n" +
                    "\n" +
                    "Не забыць, як падвялы аер\n" +
                    "На памытай падлозе пахне,\n" +
                    "Як у студню цыбаты асвер\n" +
                    "Запускае руку да пахі.\n" +
                    "\n" +
                    "Не забыць сцежкі той, што цябе\n" +
                    "На дарогу выводзіла з дому,\n" +
                    "Што ў хаце там быў рубель\n" +
                    "У цане і па курсу старому.\n" +
                    "\n" +
                    "Не забыць, як марозам злым\n" +
                    "Клямка пальцы пячэ балюча\n" +
                    "І адкуль на стале тваім\n" +
                    "Бохан свежага хлеба пахучы.\n" +
                    "\n" +
                    "Помніць свой на іржышчы цень,\n" +
                    "Не забыць, як завуць суседа,\n" +
                    "Не забыць, як пяе пад дзень\n" +
                    "За вясёлым сталом бяседа.\n" +
                    "\n" +
                    "Трэба дома бываць часцей,\n" +
                    "Трэба дома бываць не госцем,\n" +
                    "Каб душою ты стаў чысцей\n" +
                    "І не страціў святое штосьці.\n";

    public static void main(String[] args) {
        String str = versh.replaceAll("[!?,.\n]", " ");
        String[] newS = str.split(" ");
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