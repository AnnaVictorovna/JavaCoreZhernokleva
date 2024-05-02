package hometasks.lesson14.b;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                printPushes();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread one = new Thread(runnable);
        one.start();
        Thread second = new Thread(runnable);
        second.start();
    }


    private static void printPushes() throws InterruptedException {
        Random random = new Random();
        int timeForPush = random.nextInt(100, 500);
        for (int i = 0; i < 21; i++) {
            System.out.println(Thread.currentThread().getName() + "    " + i);
            Thread.sleep(timeForPush);
        }
    }
}
/*Реализовать игру Ping Pong. За один матч совершается 20 ударов по
мячу. После удара по мячу необходимо вывести в консоль информацию
кто ударил и сколько всего ударов уже было совершено за матч.*/