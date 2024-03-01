package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public class MapWorker {
    private static Map<String, String> map = new HashMap<>();

    public static Map<String, String> getMap() {
        return map;
    }

    public static void saveKeyAndValue(String string) {
        String[] parts = string.split("=");
        String before = parts[0];
        String after = parts[1];
        getMap().put(before, after);
    }
}
