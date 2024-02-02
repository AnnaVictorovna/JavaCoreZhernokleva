package hometasks.calculator;

import java.util.Arrays;
import java.util.Map;

public class Vector extends Var implements Operation {
    double[] result;

    public Vector(double[] value) {
        this.result = value;
    }

    public Vector(Vector vector) {
        this.result = vector.result;
    }

    public Vector(String strVector) {
        saveKeyAndValue(strVector);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.result = convertStringToDoubleArray(entry.getValue());
        }
    }

    public static double[] convertStringToDoubleArray(String string) {
        String string1 = string.replace("{", "");
        String string2 = string1.replace("}", "");
        String[] tokens = string2.split(",");
        return Arrays.stream(tokens).mapToDouble(Double::parseDouble).toArray();
    }

    @Override
    public String toString() {
        return "Vector{" +
                "result=" + Arrays.toString(result) +
                '}';
    }

    @Override
    public Object addition(Object double1) {
        return null;
    }

    @Override
    public Object subtraction(Object double1) {
        return null;
    }

    @Override
    public Object multiplication(Object double1) {
        return null;
    }

    @Override
    public Object division(Object double1) {
        return null;
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
Scalar, Vector, Matrix и возвращать результат вычисления.*/
