package hometasks.calculator;

public class Parser {
    public static void calculate(String stringFromUser) {
        if (stringFromUser.contains("printvar")) {
            System.out.println("Коллекция хранит в себе элементы:" + Var.map);
        } else {
            String[] parts = stringFromUser.split("=");//TODO add + - / *
            Var var1 = Var.convertStringToVar(parts[0]);
            Var var2 = Var.convertStringToVar(parts[1]);
//            Var.saveKeyAndValue(stringFromUser);
            if (stringFromUser.contains("+")) {
                var1.addition(var2);
            } else if (stringFromUser.contains("-")) {
                var1.subtraction(var2);
            } else if (stringFromUser.contains("*")) {
                var1.multiplication(var2);
            } else if (stringFromUser.contains("/")) {
                var1.division(var2);
            }
        }
    }
}
