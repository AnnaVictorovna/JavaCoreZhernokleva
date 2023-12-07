package hometasks.lesson7.b2;

public class Run {
    public static void main(String[] args) {
        Circus circus1 = new Circus("Circus1",
                "Bear can jumping",
                "Elephant can swimming",
                "Horse can running fast");
        Circus circus2 = new Circus("Circus2",
                "Bear can swimming",
                "Elephant can running",
                "Horse can jumping");

    }
}
/*Создайте класс Circus в котором будет поле name и будут поля с
типом Bear, Elephant, Horse. У каждого животного реализуйте
метод iCan(), который выводит в консоль текст “я умею ходить”. В
методе main класса Run создайте два объекта типа Circus, задайте
им имена и укажите, что умеют животные в этих цирках.*/