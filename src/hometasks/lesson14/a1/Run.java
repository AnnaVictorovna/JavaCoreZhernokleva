package hometasks.lesson14.a1;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.getState());
    }
}
