package hometasks.lesson11.a;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Random random = new Random();
        int mark = random.nextInt(0, 10);
        try {
            if (mark < 4) {
                throw new StudentException("Студент не сдал");
            }

        } catch (StudentException e) {
            System.out.println(e.getMessage() + ", потому что оценка = " + mark);
        }
    }
}
/*Создать класс StudentException и отнаследоваться от класса
Exception. Для реализации использовать функционал методов
родительского класса. Создайте класс Run и в методе main создайте
код для генерации случайной оценки. Сделайте проверку оценки, если
оценка ниже 4, то сгенерировать исключение StudentException и
вывести информации о том, что студент не сдал экзамен.*/