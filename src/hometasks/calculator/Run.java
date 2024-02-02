package hometasks.calculator;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("stop")) {
            String s = scanner.nextLine();
            Var.workWithScanner(s);
        }
    }
}
