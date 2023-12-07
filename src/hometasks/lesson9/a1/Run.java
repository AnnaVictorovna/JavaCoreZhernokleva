package hometasks.lesson9.a1;

public class Run {
    public static void main(String[] args) {
        Container<Double> container1 = new Container<>();
        Container<Integer> container2 = new Container<>();
        // а что делать, если в процессе выполнения программы нам нужно будет сохранить в наш контейнер container1 строку?
        container1.setObject(2.3);
        container2.setObject(78);
        container1.print(container1.getObject());
        container2.print(container2.getObject());


    }
}
/*Создать класс Container, который может хранить в себе один любой
объект. Реализовать методы setContent и getContent для
сохранения и извлечения этого объекта. Создать класс Run и в методе
main создать 2 объекта класса Container, сохранить значение в этом
классе, вывести это значение в консоль.*/