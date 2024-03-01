package hometasks.calculator;

import java.util.Arrays;

public class Vector extends Var {
    private double[] result;

    public double[] getResult() {
        return result;
    }

    public Vector(double[] value) {
        this.result = value;
    }

    public Vector(Vector vector) {
        this.result = vector.result;
    }

    public Vector(String strVector) {
        this.result = convertStringToDoubleArray(strVector);
    }

    public static double[] convertStringToDoubleArray(String string) {
        String string1 = string.replace("{", "");
        String string2 = string1.replace("}", "");
        String[] tokens = string2.split(",");
        return Arrays.stream(tokens).mapToDouble(Double::parseDouble).toArray();
    }

    public Var addition(Var value) {
        if (value instanceof Vector) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + ((Vector) value).getResult()[i] + " ");
            }
        }
        return null;
    }

    public Var subtraction(Var value) {
        if (value instanceof Vector) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] - ((Vector) value).getResult()[i] + " ");
            }
        }
        return null;
    }

    public Var multiplication(Var value) {
        if (value instanceof Vector) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] * ((Vector) value).getResult()[i] + " ");
            }
        }
        return null;
    }

    public Var division(Var value) {
        if (value instanceof Vector) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] / ((Vector) value).getResult()[i] + " ");
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "result=" + Arrays.toString(result) +
                '}';
    }
}