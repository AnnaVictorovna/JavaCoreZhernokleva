package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public abstract class Var {
    public static Map<String, String> map = new HashMap<>();
    static String[] stringsForKeys;
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
        saveKeyAndValue(s);
        // для чего нужны строчки ниже?
        if (s.contains("}}")) {
            Matrix matrix = new Matrix(s);
        } else if (s.contains("}")) {
            Vector vector = new Vector(s);
        } else {
            Scalar scalar = new Scalar(s);
        }
    }

    public static void separateNumericAndNonNumericString(String s, String regex) {
        if (s.matches(".*\\d.*")) {
            if (s.contains("{{")) {
                String[] strings = s.split(regex);
                operationsWithTwoMatrices(new Matrix(strings[0]), new Matrix(strings[1]));
            } else if (s.contains("{")) {
                String[] strings = s.split(regex);
                operationsWithTwoVectors(new Vector(strings[0]), new Vector(strings[1]));
            } else {
                String[] strings = s.split(regex);
                operationsWithTwoDoubles(new Scalar(strings[0]), new Scalar(strings[1]));
            }
        } else {
            String[] stringsForNumbers = s.split(regex);
            stringsForKeys = new String[]{Var.map.get(stringsForNumbers[0]), Var.map.get(stringsForNumbers[1])};
            if (stringsForKeys[0].contains("{{")) {
                operationsWithTwoMatrices(new Matrix(stringsForKeys[0]), new Matrix(stringsForKeys[1]));
            } else if (stringsForKeys[0].contains("{")) {
                operationsWithTwoVectors(new Vector(stringsForKeys[0]), new Vector(stringsForKeys[1]));
            } else {
                operationsWithTwoDoubles(new Scalar(stringsForKeys[0]), new Scalar(stringsForKeys[1]));
            }
        }
    }

    public static void operationsWithTwoMatrices(Matrix matrix1, Matrix matrix2) {
        if (regex.equals("\\+")) {
            matrix1.addition(matrix2);
        }
        if (regex.equals("\\-")) {
            matrix1.subtraction(matrix2);
        }
        if (regex.equals("\\*")) {
            matrix1.multiplication(matrix2);
        }
        if (regex.equals("\\/")) {
            matrix1.division(matrix2);
        }
    }

    public static void operationsWithTwoVectors(Vector vector1, Vector vector2) {
        if (regex.equals("\\+")) {
            vector1.addition(vector2);
        }
        if (regex.equals("\\-")) {
            vector1.subtraction(vector2);
        }
        if (regex.equals("\\*")) {
            vector1.multiplication(vector2);
        }
        if (regex.equals("\\/")) {
            vector1.division(vector2);
        }
    }

    public static void operationsWithTwoDoubles(Scalar scalar1, Scalar scalar2) {
        if (regex.equals("\\+")) {
            scalar1.addition(scalar2);
        }
        if (regex.equals("\\-")) {
            scalar1.subtraction(scalar2);
        }
        if (regex.equals("\\*")) {
            scalar1.multiplication(scalar2);
        }
        if (regex.equals("\\/")) {
            scalar1.division(scalar2);
        }
    }
}