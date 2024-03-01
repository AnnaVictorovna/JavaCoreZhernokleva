package hometasks.calculator;

public abstract class Var implements Operation<Var> {
    public static Var convertStringToVar(String string) {
        if (string.contains("{{")) {
            return new Matrix(string);
        } else if (string.contains("{")) {
            return new Vector(string);
        } else {
            return new Scalar(string);
        }
    }

    public static void operation(String[] parts, String stringFromUser) {
        Var var1 = Var.convertStringToVar(parts[0]);
        Var var2 = Var.convertStringToVar(parts[1]);
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