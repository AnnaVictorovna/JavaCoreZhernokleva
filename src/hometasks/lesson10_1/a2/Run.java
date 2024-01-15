package hometasks.lesson10_1.a2;

import java.util.Map;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();
        map.put("Иванов", 8.2);
        map.put("Петров", 8.9);
        map.put("Смирнова", 8.0);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", сумма баллов " + entry.getValue());
        }

    }
}
/*Создайте класс Run и в методе main создайте TreeMap группы с
набранными количествами баллов. Вывести в консоль список группы в
формате: Фамилия: сумма баллов.*/