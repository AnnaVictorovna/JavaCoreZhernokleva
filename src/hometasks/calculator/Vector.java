package hometasks.calculator;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Vector extends Var {
    Double[] result;

    public Vector(Double[] value) {
        this.result = value;
    }

    public Vector(Vector vector) {
        this.result = vector.result;
    }

    public Vector(String strVector) {
        saveKeyAndValue(strVector);
        this.result = convertStringToDoubleArray(strVector);
    }

    public static Double[] convertStringToDoubleArray(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string);
        int size = tokenizer.countTokens();
        Double[] doubleArray = new Double[size];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            doubleArray[index++] = Double.parseDouble(tokenizer.nextToken());
        }
        return doubleArray;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "result=" + Arrays.toString(result) +
                '}';
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
