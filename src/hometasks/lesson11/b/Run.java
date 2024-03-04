package hometasks.lesson11.b;

import java.util.Random;

public class Run {
    static int sum;

    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Random random = new Random();
        sum = bankAccount.getBalance();
        System.out.println("Ваш баланс: " + sum);
        try {
            while (sum > 5) {
                int r = random.nextInt(5, 100);
                sum = sum - r;
                System.out.println("Сумма товара: " + r);
                System.out.println("остаток на счете: " + sum);
                Thread.sleep(1000);
            }
            throw new NotEnoughMoneyException("Not enough money");
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

    }
}
/*Создайте класс NotEnoughMoneyException, который наследуется от
        Exception. Создайте класс BankAccount с переменной balance которая
        будет проинициализирована значением 150. Создайте класс Run и в
        методе main создайте объект класса BankAccount. Смоделируйте
        ситуацию покупок товаров стоимостью от 5 до 100. Совершать покупки
        до тех пор, пока баланс не станет меньше 5. В случае, если товар стоит
        больше, чем сумма на балансе, то сгенерировать исключение и
        сообщить это пользователю. После каждой покупки выводить в консоль
        информацию о состоянии баланса.*/
