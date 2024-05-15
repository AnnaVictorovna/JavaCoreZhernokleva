package hometasks.lesson14.b;

public class PingPongBall {
    private int firstPushNumber;
    private int lastPushNumber;

    public PingPongBall(int firstPushNumber, int lastPushNumber) {
        this.firstPushNumber = firstPushNumber;
        this.lastPushNumber = lastPushNumber;
    }

    public int getFirstPushNumber() {
        return firstPushNumber;
    }

    public void setFirstPushNumber(int firstPushNumber) {
        this.firstPushNumber = firstPushNumber;
    }

    public int getLastPushNumber() {
        return lastPushNumber;
    }

    public void setLastPushNumber(int lastPushNumber) {
        this.lastPushNumber = lastPushNumber;
    }
}