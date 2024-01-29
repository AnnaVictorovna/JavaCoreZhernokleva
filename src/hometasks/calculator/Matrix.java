package hometasks.calculator;

import java.util.Map;

public class Matrix extends Var {
    double[][] result;

    public Matrix(double[][] value) {
        this.result = value;
    }

    public Matrix(Matrix matrix) {
        this.result = matrix.result;
    }

    public Matrix(String strMatrix) {
        saveKeyAndValue(strMatrix);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.result = convertStringToMatrixOfDouble(entry.getValue());
        }
    }

    public static double[][] convertStringToMatrixOfDouble(String string) {
        String[] strings = string.split("},");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            while (strings[i].contains(",")) {
                count++;
            }
        }
        String[][] stringsMatrix = new String[strings.length][count + 1];
        for (int i = 0; i < stringsMatrix.length; i++) {
            for (int j = 0; j < stringsMatrix[i].length; j++) {
                stringsMatrix[i][j] += strings[i].split(",");
            }
        }
        double[][] stringMatrix = new double[strings.length][count + 1];
        for (int i = 0; i < stringMatrix.length; i++) {
            for (int j = 0; j < stringMatrix[i].length; j++) {
                stringMatrix[i][j] = Double.parseDouble(stringsMatrix[i][j]);
                System.out.print(stringMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return stringMatrix;

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
