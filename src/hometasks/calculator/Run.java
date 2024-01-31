package hometasks.calculator;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("stop")) {
            String s = scanner.nextLine();
            if (s.contains("printvar")) {
                System.out.println("Коллекция хранит в себе элементы:" + Var.map);
            } else if (s.contains("=")) {
                if (s.contains("}}")) {
                    Matrix matrix = new Matrix(s);
                } else if (s.contains("}")) {
                    Vector vector = new Vector(s);
                } else {
                    Scalar scalar = new Scalar(s);
                }

            } else if (s.contains("+")) {
                String[] stringsForNumbers = s.split("\\+");
                if (isStringHasANumber(s, "\\+")) {
                    if (stringsForNumbers[0].contains("{{")) {
                        matrixPlusMatrix(stringsForNumbers);
                    } else if (stringsForNumbers[0].contains("{")) {
                        vectorPlusVector(stringsForNumbers);
                    } else {
                        doublePlusDouble(stringsForNumbers);
                    }
                } else {
                    String[] stringsForKeys = new String[2];
                    stringsForKeys[0] = Var.map.get(stringsForNumbers[0]);
                    stringsForKeys[1] = Var.map.get(stringsForNumbers[1]);
                    if (stringsForKeys[0].contains("{{")) {
                        matrixPlusMatrix(stringsForKeys);
                    } else if (stringsForKeys[0].contains("{")) {
                        vectorPlusVector(stringsForKeys);
                    } else {
                        doublePlusDouble(stringsForKeys);
                    }
                }
            }
        }
    }

    public static boolean isStringHasANumber(String string, String regex) {
        String[] strings = string.split(regex);
        boolean hasNumber = strings[0].matches(".*\\d.*");
        return hasNumber;
    }

    public static void matrixPlusMatrix(String[] strings) {
        double[][] d1 = Matrix.convertStringToMatrixOfDoubles(strings[0]);
        double[][] d2 = Matrix.convertStringToMatrixOfDoubles(strings[1]);
        for (int i = 0; i < d1.length; i++) {
            for (int j = 0; j < d1[i].length; j++) {
                System.out.print(d1[i][j] + d2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void vectorPlusVector(String[] strings) {
        double[] d1 = Vector.convertStringToDoubleArray(strings[0]);
        double[] d2 = Vector.convertStringToDoubleArray(strings[1]);
        double[] doubles = new double[d1.length];
        for (int i = 0; i < d1.length; i++) {
            doubles[i] = d1[i] + d2[i];
            System.out.print(doubles[i] + " ");
        }
    }

    public static void doublePlusDouble(String[] strings) {
        Double d1 = Double.parseDouble(strings[0]);
        Double d2 = Double.parseDouble(strings[1]);
        System.out.println(d1 + d2);
    }


}
