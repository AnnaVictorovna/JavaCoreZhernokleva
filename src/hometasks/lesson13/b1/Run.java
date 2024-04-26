package hometasks.lesson13.b1;

import hometasks.lesson12.a1.Versh;

public class Run {
    public static void main(String[] args) {
        Converter.convertStringToCollectionOfWords(Versh.versh).stream().forEach(System.out::println);


    }
}
/*Создать класс Converter в котором есть метод преобразующий
стихотворение из класса Versh в коллекцию слов. В коллекции слов не
должны присутствовать знаки препинания и пустые значения. Создайте
класс Run и в методе main напишите код который выведет в консоль
коллекцию слов в столбик.*/