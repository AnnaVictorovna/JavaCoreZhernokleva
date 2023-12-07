package hometasks.lesson9.a2;

import java.util.Arrays;

public class Array<T> {
    private Object[] array = new Object[5];

    public Object getElement(int element) {
        return array[element];
    }

    public void setElement(int element, T t) {
        array[element] = t;
    }

    @Override
    public String toString() {
        return "array = " + Arrays.toString(array);
    }
}
/*Создать класс Array, который может хранить в себе массив из 5 любых
объектов. Реализовать методы setElement и getElement которые
будут сохранять и получать элементы по заданному индексу. В классе
Run проверить работу класса Array на объектах разного типа.*/