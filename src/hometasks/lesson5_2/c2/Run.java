package hometasks.nesterovich5_2.c2;

public class Run {
    public static void main(String[] args) {
        GardenRose gardenRose = new GardenRose();
        HomeRose homeRose = new HomeRose();
        Sunflower sunflower = new Sunflower();

        gardenRose.sunConsuming();
        gardenRose.grow();
        homeRose.grow();
        sunflower.grow();
        sunflower.growSunflowerSeeds();

    }
}
/*
Создать классы с полями и методами реализующие принципы
ООП на примере сущности Plant.
Требования:
- минимум 2 уровня наследования.
- хотя бы 1 класс потомок должен содержать метод, которого нет у
родительского класса.
- показать пример полиморфизма с интерфейсом.
Создать класс Run и в методе main продемонстрируйте работу
методов классов.
 */