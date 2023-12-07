package hometasks.lesson9.a2;

public class Run {
    public static void main(String[] args) {
        Array<Integer> integerArray = new Array();
        integerArray.setElement(1, 2);
        System.out.println(integerArray);                    //ВОПРОС
        System.out.println(integerArray.getElement(1));
        integerArray.toString();                             //ВОПРОС

        Array<String> stringArray = new Array();
        stringArray.setElement(2, "two");
        System.out.println(stringArray);
    }
}
/*Создать класс Array, который может хранить в себе массив из 5 любых
объектов. Реализовать методы setElement и getElement которые
будут сохранять и получать элементы по заданному индексу. В классе
Run проверить работу класса Array на объектах разного типа.*/