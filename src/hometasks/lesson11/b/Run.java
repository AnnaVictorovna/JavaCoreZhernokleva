package hometasks.lesson11.b;

public class Run {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
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
