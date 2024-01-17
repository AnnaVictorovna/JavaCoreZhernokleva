package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var {
    public double[][] value;
    public Matrix matrix;
    public String strMatrix;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix(String strMatrix) {
        this.strMatrix = strMatrix;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "value=" + Arrays.toString(value) +
                ", matrix=" + matrix +
                ", strMatrix='" + strMatrix + '\'' +
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