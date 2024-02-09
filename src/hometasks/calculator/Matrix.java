package hometasks.calculator;

public class Matrix extends Var implements Operation<Var> {
    private double[][] result;

    public double[][] getResult() {
        return result;
    }

    public Matrix(double[][] value) {
        this.result = value;
    }

    public Matrix(Matrix matrix) {
        this.result = matrix.result;
    }

    public Matrix(String strMatrix) {
//        saveKeyAndValue(strMatrix);
//        for (Map.Entry<String, String> entry : map.entrySet()) {
        this.result = convertStringToMatrixOfDoubles(strMatrix);
    }

    public static double[][] convertStringToMatrixOfDoubles(String string) {
        String[] newStrings = string.split("},\\{");
        double[] doubles = Vector.convertStringToDoubleArray(newStrings[0]);
        double[][] matrix = new double[newStrings.length][doubles.length];
        for (int i = 0; i < newStrings.length; i++) {
            matrix[i] = Vector.convertStringToDoubleArray(newStrings[i]);
        }
        return matrix;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "result=" + result +
                '}';
    }

    @Override
    public Var addition(Var matrixOne) {
        if (matrixOne instanceof Matrix) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + ((Matrix) matrixOne).result[i][j] + " ");
                }
                System.out.println();
            }
        }
        return null;
    }

    @Override
    public Var subtraction(Var matrixOne) {
        if (matrixOne instanceof Matrix) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] - ((Matrix) matrixOne).result[i][j] + " ");
                }
                System.out.println();
            }
        }
        return null;
    }

    @Override
    public Var multiplication(Var matrixOne) {
        if (matrixOne instanceof Matrix) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] * ((Matrix) matrixOne).result[i][j] + " ");
                }
                System.out.println();
            }
        }
        return null;
    }

    @Override
    public Var division(Var matrixOne) {
        if (matrixOne instanceof Matrix) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] / ((Matrix) matrixOne).result[i][j] + " ");
                }
                System.out.println();
            }
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
метод на вход должен принимать один параметр с типом
Scalar, Vector, Matrix и возвращать результат вычисления.*/
