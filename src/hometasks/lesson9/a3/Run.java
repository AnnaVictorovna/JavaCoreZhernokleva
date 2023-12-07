package hometasks.lesson9.a3;

public class Run {
    public static void main(String[] args) {
        NumberArray<Number> array = new NumberArray<>();
        array.setElement(0, 1);
        array.setElement(1, 2);
        array.setElement(2, 3.0);
        array.setElement(3, 4);
        array.setElement(4, 5);
        array.printArray();

    }
}
/*Создать класс NumberArray, который может хранить в себе массив
только из 5 числовых типов. Реализовать методы setElement и
getElement которые будут сохранять и получать элементы по
заданному индексу. Реализовать метод printArray, который будет
выводить в консоль все данные хранящиеся в этом классе. Создать
класс Run и в методе main создать объект класса NumberArray
сохранив в него 5 чисел, выведите эти числа в консоль.*/