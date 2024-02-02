package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public abstract class Var {
    public static Map<String, String> map = new HashMap<>();
    static double[][] matrixOne;
    static double[][] matrixTwo;
    static double[] vectorsOne;
    static double[] vectorsTwo;
    static String[] stringsForKeys;
    static double d1;
    static double d2;
    static String regex;

    public static Map<String, String> saveKeyAndValue(String string) {
        String[] parts = string.split("=");
        String before = parts[0];
        String after = parts[1];
        map.put(before, after);
        return map;
    }

    public static void workWithScanner(String s) {
        if (s.contains("printvar")) {
            System.out.println("Коллекция хранит в себе элементы:" + Var.map);
        } else if (s.contains("=")) {
            operationEqually(s);
        } else if (s.contains("+")) {
            regex = "\\+";
            separateNumericAndNonNumericString(s, regex);
        } else if (s.contains("-")) {
            regex = "\\-";
            separateNumericAndNonNumericString(s, regex);
        } else if (s.contains("*")) {
            regex = "\\*";
            separateNumericAndNonNumericString(s, regex);
        } else if (s.contains("/")) {
            regex = "\\/";
            separateNumericAndNonNumericString(s, regex);
        }
    }

    public static void operationEqually(String s) {
        if (s.contains("}}")) {
            Matrix matrix = new Matrix(s);
        } else if (s.contains("}")) {
            Vector vector = new Vector(s);
        } else {
            Scalar scalar = new Scalar(s);
        }
    }

    public static void createTwoMatrixes(String[] strings) {
        matrixOne = Matrix.convertStringToMatrixOfDoubles(strings[0]);
        matrixTwo = Matrix.convertStringToMatrixOfDoubles(strings[1]);
    }

    public static void createTwoVectors(String[] strings) {
        vectorsOne = Vector.convertStringToDoubleArray(strings[0]);
        vectorsTwo = Vector.convertStringToDoubleArray(strings[1]);
    }

    public static void createTwoDoubles(String[] strings) {
        d1 = Double.parseDouble(strings[0]);
        d2 = Double.parseDouble(strings[1]);
    }

    public static void separateNumericAndNonNumericString(String s, String regex) {
        if (s.matches(".*\\d.*")) {
            if (s.contains("{{")) {
                createTwoMatrixes(s.split(regex));
                operationsWithTwoMatriсes();
            } else if (s.contains("{")) {
                createTwoVectors(s.split(regex));
                operationsWithTwoVectors();
            } else {
                createTwoDoubles(s.split(regex));
                operationsWithTwoDoubles();
            }
        } else {
            String[] stringsForNumbers = s.split(regex);
            stringsForKeys = new String[]{Var.map.get(stringsForNumbers[0]), Var.map.get(stringsForNumbers[1])};
            if (stringsForKeys[0].contains("{{")) {
                createTwoMatrixes(stringsForKeys);
                operationsWithTwoMatriсes();
            } else if (stringsForKeys[0].contains("{")) {
                createTwoVectors(stringsForKeys);
                operationsWithTwoVectors();
            } else {
                createTwoDoubles(stringsForKeys);
                operationsWithTwoDoubles();
            }
        }
    }

    public static void operationsWithTwoMatriсes() {
        if (regex.equals("\\+")) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    System.out.print(matrixOne[i][j] + matrixTwo[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (regex.equals("\\-")) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    System.out.print(matrixOne[i][j] - matrixTwo[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (regex.equals("\\*")) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    System.out.print(matrixOne[i][j] * matrixTwo[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (regex.equals("\\/")) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    System.out.print(matrixOne[i][j] / matrixTwo[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void operationsWithTwoVectors() {
        if (regex.equals("\\+")) {
            for (int i = 0; i < vectorsOne.length; i++) {
                System.out.print(vectorsOne[i] + vectorsTwo[i] + " ");
            }
        }
        if (regex.equals("\\-")) {
            for (int i = 0; i < vectorsOne.length; i++) {
                System.out.print(vectorsOne[i] - vectorsTwo[i] + " ");
            }
        }
        if (regex.equals("\\*")) {
            for (int i = 0; i < vectorsOne.length; i++) {
                System.out.print(vectorsOne[i] * vectorsTwo[i] + " ");
            }
        }
        if (regex.equals("\\/")) {
            for (int i = 0; i < vectorsOne.length; i++) {
                System.out.print(vectorsOne[i] / vectorsTwo[i] + " ");
            }
        }
    }

    public static void operationsWithTwoDoubles() {
        if (regex.equals("\\+")) {
            System.out.println(d1 + d2);
        }
        if (regex.equals("\\-")) {
            System.out.println(d1 - d2);
        }
        if (regex.equals("\\*")) {
            System.out.println(d1 * d2);
        }
        if (regex.equals("\\/")) {
            System.out.println(d1 / d2);
        }
    }
}