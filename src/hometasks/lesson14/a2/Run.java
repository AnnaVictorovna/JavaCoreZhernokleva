package hometasks.lesson14.a2;

public class Run {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println(thread.getState());
    }
}
/*Создайте класс MyRunnable который имплементирует Runnable.
Создайте класс Run и в методе main напишите код в котором
запускается новый поток класса MyRunnable и выводится в консоль
состояние потока.*/