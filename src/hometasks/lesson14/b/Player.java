package hometasks.lesson14.b;

import static hometasks.lesson14.b.Run.pingPongBall;

public class Player extends Thread {
    public Player(String playerName) {
        setName(playerName);
    }

    public void run() {
        try {
            while (pingPongBall.getPushNumber() < 20) {
                synchronized (pingPongBall) {
                    pingPongBall.notify();
                    pingPongBall.wait(1);
                    System.out.println(Thread.currentThread().getName() + " " + pingPongBall.getPushNumber());
                    pingPongBall.setPushNumber(pingPongBall.getPushNumber() + 1);
                }
            }
        } catch (InterruptedException ignored) {
        }
    }
}
