package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public abstract class Var<Y> {
    public static Map<String, String> map = new HashMap<>();

    public static Map<String, String> saveKeyAndValue(String string) {
        if (string.equals("printvar")) {
            System.out.println(map);
        } else {
            String[] parts = string.split("=");
            String before = parts[0];
            String after = parts[1];
            map.put(before, after);
        }
        return map;
    }
}
/*1.Создайте классы Scalar, Vector, Matrix, которые
наследуются от абстрактного класса Var. для каждого класса
наследника создайте по 3 конструктора с сигнатурами:

Scalar Scalar(double value)
Scalar(Scalar scalar)
Scalar(String strScalar)
Vector Vector(double[] value)
Vector(Vector vector)
Vector(String strVector)
Matrix Matrix(double[][] value)
Matrix(Matrix matrix)
Matrix(String strMatrix)

Каждый конструктор должен сохранить переданное значение в
переменную класса.
2. Для каждого класса переопределите метод toString().
3. Создайте интерфейс Operation с четырьмя методами для
сложения, вычитания, умножения, деления значений. Каждый
метод на вход должен принимать один параметра с типом
Scalar, Vector, Matrix и возвращать результат вычисления.

Дополните калькулятор функцией сохранения значений в переменные.
Для сохранения значения в переменную используйте знак =. Пример
ввода: А=3, В={1,2,3}.*/