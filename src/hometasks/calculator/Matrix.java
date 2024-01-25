package hometasks.calculator;

import java.util.Map;

public class Matrix extends Var {
    Double[][] result;

    public Matrix(Double[][] value) {
        this.result = value;
    }

    public Matrix(Matrix matrix) {
        this.result = matrix.result;
    }

    public Matrix(String strMatrix) {
        if (strMatrix.equals("printvar")) {
            System.out.println(map);
        } else if (strMatrix.contains("=")) {
            saveKeyAndValue(strMatrix);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.result = convertStringToMatrixOfDouble(entry.getValue());
            }
        } else {
            this.result = convertStringToMatrixOfDouble(strMatrix);
        }
    }

    public static Double[][] convertStringToMatrixOfDouble(String string) {
        String[] strings = string.split("},");
        Double[][] matrixOfDoubles = new Double[strings.length][];
        return matrixOfDoubles;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "result=" + result +
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
метод на вход должен принимать один параметр с типом
Scalar, Vector, Matrix и возвращать результат вычисления.*/
