package hometasks.nesterovich5_2.c3;

public class Run {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        CarShop carShop = new CarShop();
        BMWCarShop bmwCarShop = new BMWCarShop();
        MinskBMWCarShop minskBMWCarShop = new MinskBMWCarShop();

        flowerShop.earnMoney();
        carShop.earnMoney();
        carShop.earnMoney(100, 40);
        carShop.showCarsForClients();
        bmwCarShop.earnMoney();
        minskBMWCarShop.earnMoney();

    }
}
/*
Создать классы с полями и методами реализующие принципы
ООП на примере сущности Shop.
Требования:
- минимум 3 уровня наследования.
- хотя бы 1 класс потомок должен содержать метод, которого нет у
родительского класса.
- показать пример статического и динамического полиморфизма.
Создать класс Run и в методе main продемонстрируйте работу
методов классов.
 */