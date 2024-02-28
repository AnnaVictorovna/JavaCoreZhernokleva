package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation<Var> {
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

    public boolean isStringContainsNumber(String string) {
        return string.matches(".*\\d.*");
    }

    public static Var convertStringToVar(String string) {
        if (string.contains("{{")) {
            return new Matrix(string);
        } else if (string.contains("{")) {
            return new Vector(string);
        } else {
            return new Scalar(string);
        }
    }


    public static void separateNumericAndNonNumericString(String s, String regex) {
        if (s.matches(".*\\d.*")) {
            if (s.contains("{{")) {
                String[] strings = s.split(regex);
//                operationsWithTwoMatrices(new Matrix(strings[0]), new Matrix(strings[1]));
            } else if (s.contains("{")) {
                String[] strings = s.split(regex);
//                operationsWithTwoVectors(new Vector(strings[0]), new Vector(strings[1]));
            } else {
                String[] strings = s.split(regex);
//                operationsWithTwoDoubles(new Scalar(strings[0]), new Scalar(strings[1]));
            }
        } else {
            String[] stringsForNumbers = s.split(regex);
            stringsForKeys = new String[]{Var.map.get(stringsForNumbers[0]), Var.map.get(stringsForNumbers[1])};
            if (stringsForKeys[0].contains("{{")) {
//                operationsWithTwoMatrices(new Matrix(stringsForKeys[0]), new Matrix(stringsForKeys[1]));
            } else if (stringsForKeys[0].contains("{")) {
//                operationsWithTwoVectors(new Vector(stringsForKeys[0]), new Vector(stringsForKeys[1]));
            } else {
//                operationsWithTwoDoubles(new Scalar(stringsForKeys[0]), new Scalar(stringsForKeys[1]));
            }
        }
    }

    @Override
    public Var addition(Var double1) {
        return null;
    }

    @Override
    public Var subtraction(Var double1) {
        return null;
    }

    @Override
    public Var multiplication(Var double1) {
        return null;
    }

    @Override
    public Var division(Var double1) {
        return null;
    }

    //    public static void operationsWithTwoMatrices(Var matrix1, Var matrix2) {
//        if (regex.equals("\\+")) {
//            matrix1.addition(matrix2);
//        }
//        if (regex.equals("\\-")) {
//            matrix1.subtraction(matrix2);
//        }
//        if (regex.equals("\\*")) {
//            matrix1.multiplication(matrix2);
//        }
//        if (regex.equals("\\/")) {
//            matrix1.division(matrix2);
//        }
//    }
//
//    public static void operationsWithTwoVectors(Vector vector1, Vector vector2) {
//        if (regex.equals("\\+")) {
//            vector1.addition(vector2);
//        }
//        if (regex.equals("\\-")) {
//            vector1.subtraction(vector2);
//        }
//        if (regex.equals("\\*")) {
//            vector1.multiplication(vector2);
//        }
//        if (regex.equals("\\/")) {
//            vector1.division(vector2);
//        }
//    }
//
//    public static void operationsWithTwoDoubles(Scalar scalar1, Scalar scalar2) {
//        if (regex.equals("\\+")) {
//            scalar1.addition(scalar2);
//        }
//        if (regex.equals("\\-")) {
//            scalar1.subtraction(scalar2);
//        }
//        if (regex.equals("\\*")) {
//            scalar1.multiplication(scalar2);
//        }
//        if (regex.equals("\\/")) {
//            scalar1.division(scalar2);
//        }
//    }
}