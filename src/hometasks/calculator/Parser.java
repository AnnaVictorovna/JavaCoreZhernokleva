package hometasks.calculator;

public class Parser {
    public static void calculate(String stringFromUser) {
        if (stringFromUser.contains("printvar")) {
            System.out.println("Коллекция хранит в себе элементы:" + MapWorker.map);
        } else if (stringFromUser.contains("=")) {
            MapWorker.saveKeyAndValue(stringFromUser);
        } else {
            String[] parts = stringFromUser.split("[-+/*]");
            if (parts[0].matches(".*\\d.*")) {
                Var.operation(parts, stringFromUser);
            } else {
                String[] stringsForKeys = new String[]{MapWorker.map.get(parts[0]), MapWorker.map.get(parts[1])};
                Var.operation(stringsForKeys, stringFromUser);
            }
        }
    }
}