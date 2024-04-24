package hometasks.lesson13.a3;

import java.util.Random;
import java.util.stream.IntStream;

public class Run {
    public static int intSize = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[intSize];
        for (int i = 0; i < intSize; i++) {
            array[i] = random.nextInt(0, intSize);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = IntStream.of(array).sum();
        System.out.println("sum of array is " + sum);

    }
}
/*Создайте класс Run и в методе main напишите код, который генерирует
массив случайных чисел (от 0 до 10) из 10 элементов и с помощью
Stream API находит сумму всех этих чисел. Выведите массив случайных
чисел в консоль, а также их сумму.*/