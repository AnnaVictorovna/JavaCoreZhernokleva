package hometasks.lesson6.a2;

public class House {
    public static void main(String[] args) {
        String house = "дом";
        int length = house.length();
        System.out.println(length);
        String up = house.toUpperCase();
        String newWord = up.replace('Д', 'K');
        System.out.println(newWord);
    }
}
/*
Сохраните слово “дом” в переменную. Найдите длину этого слова и
выведите на экран. Переведите все буквы этой переменной в
верхний регистр. Замените одну букву так, чтобы получилось другое
слово, результат сохраните в новую переменную и выведите на
экран.
 */
