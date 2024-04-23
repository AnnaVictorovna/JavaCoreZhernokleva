package hometasks.lesson13.a1;

public class Run {
    public static void main(String[] args) {
        Operationable operationable = (x, y) -> x + y;
        int result = operationable.findSum(25, 15);
        System.out.println(result);
    }
}
/*Создайте класс Run и в методе main напишите код, который с помощью
лямбда-выражения суммирует два числовых значения переменных и
возвращает их сумму в консоль.*/