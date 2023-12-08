package hometasks.lesson9.b1;

import java.util.Arrays;

public class Array<T> {
    private static int arrayLength = 4;
    Object[] array = new Object[arrayLength];

    public void isArrayFullOrNot() {
        int howManyNotFullPositionsInArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                howManyNotFullPositionsInArray++;
            }
        }
        if (howManyNotFullPositionsInArray > 0) {
            arrayLength = arrayLength * 2;
        }
    }

    public void setElement(Object element) {
        isArrayFullOrNot();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                break;
            }
        }
    }

    public void getElement(int index) {
        System.out.println("Индексу " + index + " соответствует элемент " + array[index]);
    }

    public void contains(Object element) {
        String contain = "Такой элемент НЕ содержится в массиве";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                contain = "Такой элемент содержится в массиве";
            }
        }
        System.out.println(contain);
    }

    public void getIndex(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Элемент " + element + " соответствует индексу " + i);
            }
        }
    }

    public void printArray() {
        System.out.println("array = " + Arrays.toString(array));
    }


}
/*3.Дополнить первое задание созданием функционала, который будет
расширять вместимость массива в 2 раза, если при добавлении нового
элемента в массив все ячейки уже заняты. Проверить работу этого
метода.*/