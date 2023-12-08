package hometasks.lesson9.b1;

public class Run {
    public static void main(String[] args) {
        Array<Integer> integerArray = new Array();
        integerArray.setElement(1);
        integerArray.setElement(2);
        integerArray.setElement(3);
        integerArray.setElement(4);
        integerArray.printArray();
        integerArray.setElement(5);
        integerArray.setElement(6);
        integerArray.printArray();


        integerArray.getElement(2);

        integerArray.getIndex(2);
        integerArray.getIndex(111);

        integerArray.contains(2);
        integerArray.contains("aa");

        integerArray.printArray();

    }
}
/*1.Создать обобщённый класс Array, который хранит в себе массив
объектов в количестве 10 шт по умолчанию. Реализовать метод
setElement, который будет сохранять в первую свободную ячейку
элемент. Реализовать метод getElement, который будет выводить
элемент по заданному индексу. Реализовать метод contains, который
будет проверять содержится ли уже такой элемент в массиве.
Реализовать метод getIndex, который на входе будет принимать
элемент, а на выходе индекс этого элемента в массиве. Создать класс
Run и в методе main проверить работу каждого метода.*/

/*2.Дополнить первое задание созданием метода printArray, который
будет выводить в консоль все элементы, которые хранятся в массиве.
Проверить работу этого метода.*/

/*3.Дополнить первое задание созданием функционала, который будет
расширять вместимость массива в 2 раза, если при добавлении нового
элемента в массив все ячейки уже заняты. Проверить работу этого
метода.*/