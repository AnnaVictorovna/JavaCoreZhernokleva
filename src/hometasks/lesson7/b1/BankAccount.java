package hometasks.lesson7.b1;

public class BankAccount {
    private int number;
    private int balance;

    public BankAccount(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    class Transaction {
        public int increasingCount(int moneyForIncreasingBalance) {
            balance = balance + moneyForIncreasingBalance;
            return balance;
        }

        public int getMoneyFromCard(int moneyFromCard) {
            if (balance > 0 && moneyFromCard < balance) {
                balance = balance - moneyFromCard;
            } else {
                System.out.println("not enough money on card");
            }
            return balance;
        }

        public void getBalance() {
            System.out.println("Your balance is " + balance);
        }

    }
}
/*Создать класс BankAccount, который представляет банковский счет.
Каждый банковский счет имеет уникальный номер и баланс. Класс
BankAccount должен содержать внутренний класс Transaction,
который представляет транзакцию на счете. Внутренний класс
Transaction должен иметь методы для пополнения счёта и снятия
средств с баланса, а также для получения информации о текущем
балансе.*/