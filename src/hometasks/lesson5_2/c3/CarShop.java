package hometasks.nesterovich5_2.c3;

public class CarShop extends Shop {
    public void showCarsForClients() {
    }

    @Override
    public void earnMoney() {
        super.earnMoney();
    }

    public void earnMoney(int profit, int tax) {
        System.out.println(profit - tax);

    }
}
