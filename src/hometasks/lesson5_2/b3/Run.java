package hometasks.nesterovich5_2.b3;

public class Run {
    public static void main(String[] args) {
        Bullfinch bullfinch = new Bullfinch();
        Chicken chicken = new Chicken();
        Cock cock = new Cock();
        Cuckoo cuckoo = new Cuckoo();
        Duck duck = new Duck();
        Goose goose = new Goose();
        Partridge partridge = new Partridge();
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();

        bullfinch.voice();
        bullfinch.fly();
        chicken.voice();
        cock.voice();
        cuckoo.voice();
        cuckoo.fly();
        duck.voice();
        duck.fly();
        goose.voice();
        goose.fly();
        partridge.voice();
        partridge.fly();
        pigeon.voice();
        pigeon.fly();
        crow.voice();
        crow.fly();

    }
}
/*
Создайте класс Bird. Для этого класса придумайте наследников в
три уровня, на каждом уровне по 3 вида. В классах наследниках
реализуйте метод voice(). Для каждого младшего наследника
создайте объект в классе Run и вызовите метод voice(), чтобы
увидеть в консоле какой звук издает птица.

 */
