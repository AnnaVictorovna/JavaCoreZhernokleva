package hometasks.lesson14.b;

import static hometasks.lesson14.b.Run.pingPongBall;

public class Player extends Thread {
    public Player(String playerName) {
        setName(playerName);
    }

    public void run() {
        try {
            while (pingPongBall.getFirstPushNumber() < pingPongBall.getLastPushNumber()) {
                synchronized (pingPongBall) {
                    pingPongBall.notify();
                    pingPongBall.wait(1);
                    System.out.println(Thread.currentThread().getName() + " " + pingPongBall.getFirstPushNumber());
                    pingPongBall.setFirstPushNumber(pingPongBall.getFirstPushNumber() + 1);
                }
            }
        } catch (InterruptedException ignored) {
        }
    }
}
