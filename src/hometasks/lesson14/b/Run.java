package hometasks.lesson14.b;

public class Run {
    static Integer pushNumber = 1;
    static Thread playerOne = new Thread(Run::playerOneIsPushing);
    static Thread playerTwo = new Thread(Run::playerTwoIsPushing);

    public static void main(String[] args) {
        playerOne.setName("Player1");
        playerTwo.setName("Player2");
        playerOne.start();
        playerTwo.start();
    }

    private static void playerOneIsPushing() {
        try {
            while (pushNumber < 20) {
                synchronized (pushNumber) {
                    pushNumber.notify();
                    pushNumber.wait(100);
                    System.out.println(Thread.currentThread().getName() + " " + pushNumber);
                    pushNumber++;
                }
            }
        } catch (InterruptedException ignored) {
        }
    }

    private static void playerTwoIsPushing() {
        try {
            while (pushNumber < 20) {
                synchronized (pushNumber) {
                    pushNumber.notify();
                    pushNumber.wait(100);
                    System.out.println(Thread.currentThread().getName() + " " + pushNumber);
                    pushNumber++;
                }
            }
        } catch (InterruptedException ignored) {
        }
    }
}
/*Реализовать игру Ping Pong. За один матч совершается 20 ударов по
мячу. После удара по мячу необходимо вывести в консоль информацию
кто ударил и сколько всего ударов уже было совершено за матч.*/