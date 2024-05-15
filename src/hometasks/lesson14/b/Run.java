package hometasks.lesson14.b;

public class Run {
    static Player playerOne = new Player("ilya");
    static Player playerTwo = new Player("anya");
    volatile static PingPongBall pingPongBall = new PingPongBall(1, 20);

    public static void main(String[] args) throws InterruptedException {
        playerOne.start();
        playerTwo.start();
        playerOne.join();
        playerTwo.join();
    }
}
/*Реализовать игру Ping Pong. За один матч совершается 20 ударов по
мячу. После удара по мячу необходимо вывести в консоль информацию
кто ударил и сколько всего ударов уже было совершено за матч.*/