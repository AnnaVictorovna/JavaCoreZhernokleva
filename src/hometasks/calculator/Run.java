package hometasks.calculator;

import java.util.Scanner;

public class Run {
    static final String PLUS = "+";

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
            } else if (s.contains(PLUS)) {
                String[] strings = s.split("\\+");
                if (isStringHasANumber(s, "\\+")) {
                    if (strings[0].contains("{{")) {
                    } else if (strings[0].contains("{")) {
                    } else {
                        Double d1 = Double.parseDouble(strings[0]);
                        Double d2 = Double.parseDouble(strings[1]);
                        System.out.println(d1 + d2);
                    }
                } else {
                    String s1 = Var.map.get(strings[0]);
                    String s2 = Var.map.get(strings[1]);
                    if (strings[0].contains("{{")) {
                    } else if (strings[0].contains("{")) {
                    } else {
                        Double d1 = Double.parseDouble(s1);
                        Double d2 = Double.parseDouble(s2);
                        System.out.println(d1 + d2);
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
}
