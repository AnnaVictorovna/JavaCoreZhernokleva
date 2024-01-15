package hometasks.lesson10_1.a1;

import java.util.HashMap;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("Якуб Колас", 375291113355L);
        map.put("Янка Купала", 375336664455L);
        map.put("Васіль Быкаў", 375333451177L);
        map.put("Рыгор Барадулін", 375257773345L);
        map.put("Янка Маўр", 375297774488L);
        map.put("Святлана Алексіевіч", 375447998811L);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println("Имя Фамилия: " + entry.getKey() + ", номер " + entry.getValue());
        }

    }
}
/*Создайте класс Run и в методе main сохраните в HashMap данные из
таблицы:
375291113355 Якуб Колас
375336664455 Янка Купала
375333451177 Васіль Быкаў
375257773345 Рыгор Барадулін
375297774488 Янка Маўр
375447998811 Святлана Алексіевіч

Выведите данные в консоль в формате: Имя Фамилия: номер*/