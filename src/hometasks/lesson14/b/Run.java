package hometasks.lesson14.b;

public class Run {
    static Integer pushesNumber = 1;

    public static void main(String[] args) {
        while (pushesNumber < 21) {
            Thread playerOne = new Thread(Run::pushing);
            Thread playerTwo = new Thread(Run::pushing);
            playerTwo.setName("playerTwo");
            playerOne.setName("playerOne");
            playerOne.start();
            playerTwo.start();
            playerTwo.interrupt();
            playerOne.interrupt();
        }
    }

    static synchronized void pushing() {
        if (pushesNumber < 21) {
            System.out.println(Thread.currentThread().getName() + pushesNumber);
            pushesNumber++;
        }
    }
}
/*Реализовать игру Ping Pong. За один матч совершается 20 ударов по
мячу. После удара по мячу необходимо вывести в консоль информацию
кто ударил и сколько всего ударов уже было совершено за матч.*/