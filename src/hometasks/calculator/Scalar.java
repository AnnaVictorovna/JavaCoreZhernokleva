package hometasks.calculator;

public class Scalar extends Var implements Operation<Var> {
    private Double result;

    public Double getResult() {
        return result;
    }

    public Scalar(Double value) {
        this.result = value;
    }

    public Scalar(Scalar scalar) {
        this.result = scalar.result;
    }

    public Scalar(String strScalar) {
//        saveKeyAndValue(strScalar);
//        for (Map.Entry<String, String> entry : map.entrySet()) {
        this.result = Double.parseDouble(strScalar);
    }

    @Override
    public String toString() {
        return "Scalar{" +
                "result=" + result +
                '}';
    }

    @Override
    public Var addition(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result + ((Scalar) double1).getResult());
        }
        return null;
    }

    @Override
    public Var subtraction(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result - ((Scalar) double1).getResult());
        }
        return null;
    }

    @Override
    public Var multiplication(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result * ((Scalar) double1).getResult());
        }
        return null;
    }

    @Override
    public Var division(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result / ((Scalar) double1).getResult());
        }
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
Scalar, Vector, Matrix и возвращать результат вычисления.

4. Создайте консольную команду для калькулятора printvar, после ввода
которой в консоль будет выводиться список всех сохранённых
переменный в формате А=3. В классе Run создайте метод для проверки
работы консольной команды printvar и в методе main
продемонстрируйте работу этого метода.*/
