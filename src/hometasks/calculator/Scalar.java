package hometasks.calculator;

public class Scalar extends Var {
    Double result;

    public Scalar(Double value) {
        this.result = value;
    }

    public Scalar(Scalar scalar) {
        this.result = scalar.result;
    }

    public Scalar(String strScalar) {
        this.result = Double.parseDouble(strScalar);
    }

    @Override
    public String toString() {
        return "Scalar{" +
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
метод на вход должен принимать один параметра с типом
Scalar, Vector, Matrix и возвращать результат вычисления.*/
