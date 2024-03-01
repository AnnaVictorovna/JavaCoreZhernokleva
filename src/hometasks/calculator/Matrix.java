package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var {
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
        this.result = convertStringToMatrixOfDoubles(strMatrix);
    }

    private static double[][] convertStringToMatrixOfDoubles(String string) {
        String[] newStrings = string.split("},\\{");
        double[] doubles = Vector.convertStringToDoubleArray(newStrings[0]);
        double[][] matrix = new double[newStrings.length][doubles.length];
        for (int i = 0; i < newStrings.length; i++) {
            matrix[i] = Vector.convertStringToDoubleArray(newStrings[i]);
        }
        return matrix;
    }

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

    @Override
    public String toString() {
        return "Matrix{" +
                "result=" + Arrays.toString(result) +
                '}';
    }
}