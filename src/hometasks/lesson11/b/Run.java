package hometasks.lesson11.b;

import java.util.Random;

public class Run {
    static int sum;
    static int productsCoast;

    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Random random = new Random();
        sum = bankAccount.getBalance();
        System.out.println("Ваш баланс: " + sum);
        try {
            while (sum > 5) {
                productsCoast = random.nextInt(5, 100);
                sum = sum - productsCoast;
                System.out.println("Сумма товара: " + productsCoast);
                if (sum >= 5) {
                    System.out.println("остаток на счете: " + sum);
                }
            }
            throw new NotEnoughMoneyException("Нельзя совершить покупку");
        } catch (NotEnoughMoneyException e) {
            sum = sum + productsCoast;
            System.err.println(e.getMessage() + ", потому что товар стоит " + productsCoast + ", а остаток на счете: " + sum);
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
