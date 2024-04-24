package hometasks.lesson13.a2;

import java.util.Random;
import java.util.stream.Stream;

public class Run {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arrayOfRandomNumbers = new Integer[ARRAY_SIZE];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(-10, 10);
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }
        System.out.println();
        int max = Stream.of(arrayOfRandomNumbers).max(Integer::compareTo).get();
        System.out.println("max number of array is " + max);
    }
}
/*Создайте класс Run и в методе main напишите код, который генерирует
массив случайных чисел из 10 элементов и с помощью Stream API
находит максимальное число из сгенерированных. Выведите массив
случайных чисел в консоль, а также максимальное из них.*/
