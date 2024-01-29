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
                String[] strings = s.split("\\+");
                if (isStringHasANumber(s, "\\+")) {
                    if (strings[0].contains("{{")) {
                        double[][] d1 = Matrix.convertStringToMatrixOfDouble(strings[0]);
                        double[][] d2 = Matrix.convertStringToMatrixOfDouble(strings[1]);
                        for (int i = 0; i < d1.length; i++) {
                            for (int j = 0; j < d1[i].length; j++) {
                                System.out.print(d1[i][j] + d2[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (strings[0].contains("{")) {
                        double[] d1 = Vector.convertStringToDoubleArray(strings[0]);
                        double[] d2 = Vector.convertStringToDoubleArray(strings[1]);
                        double[] doubles = new double[d1.length];
                        for (int i = 0; i < d1.length; i++) {
                            doubles[i] = d1[i] + d2[i];
                            System.out.print(doubles[i] + " ");
                        }
                    } else {
                        Double d1 = Double.parseDouble(strings[0]);
                        Double d2 = Double.parseDouble(strings[1]);
                        System.out.println(d1 + d2);
                    }
                } else {
                    String s1 = Var.map.get(strings[0]);
                    String s2 = Var.map.get(strings[1]);
                    if (s1.contains("{{")) {

                    } else if (s1.contains("{")) {
                        double[] d1 = Vector.convertStringToDoubleArray(s1);
                        double[] d2 = Vector.convertStringToDoubleArray(s2);
                        double[] doubles = new double[d1.length];
                        for (int i = 0; i < d1.length; i++) {
                            doubles[i] = d1[i] + d2[i];
                            System.out.print(doubles[i] + " ");
                        }
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
