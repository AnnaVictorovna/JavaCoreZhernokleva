package hometasks.lesson17.b1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        LocalDateTime newLocalData = LocalDateTime.now();
        String newFormat = newLocalData.format(DateTimeFormatter.ofPattern("HH:mm:ss E dd MMMM yyyy"));
        System.out.println(newFormat);
    }

}
/*Создайте свой формат даты вида: 18:34:22 Ср 31 ноября 2023.
Продемонстрируйте результат вывода текущей даты в консоли.*/