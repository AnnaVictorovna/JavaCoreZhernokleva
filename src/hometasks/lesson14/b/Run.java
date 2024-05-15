package hometasks.lesson14.b;

public class Run {
    volatile static Integer ballPush = 1;
    static Thread playerOne = new Thread(Run::playerOneIsPushing);
    static Thread playerTwo = new Thread(Run::playerTwoIsPushing);

    public static void main(String[] args) throws InterruptedException {
        playerOne.setName("Player1");
        playerTwo.setName("Player2");
        playerOne.start();
        playerTwo.start();
        playerOne.join();
        playerTwo.join();
    }

    private static void playerOneIsPushing() {
        try {
            while (ballPush < 20) {
                synchronized (ballPush) {
                    ballPush.notify();
                    ballPush.wait(5);
                    System.out.println(Thread.currentThread().getName() + " " + ballPush);
                    ballPush++;
                }
            }
        } catch (InterruptedException ignored) {
        }
    }

    private static void playerTwoIsPushing() {
        try {
            while (ballPush < 20) {
                synchronized (ballPush) {
                    ballPush.notify();
                    ballPush.wait(5);
                    System.out.println(Thread.currentThread().getName() + " " + ballPush);
                    ballPush++;
                }
            }
        } catch (InterruptedException ignored) {
        }
    }
}
/*Реализовать игру Ping Pong. За один матч совершается 20 ударов по
мячу. После удара по мячу необходимо вывести в консоль информацию
кто ударил и сколько всего ударов уже было совершено за матч.*/