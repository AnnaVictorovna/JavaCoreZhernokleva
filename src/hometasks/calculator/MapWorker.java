package hometasks.calculator;

import java.util.HashMap;
import java.util.Map;

public class MapWorker {
    public static Map<String, String> map = new HashMap<>();

    public static void saveKeyAndValue(String string) {
        String[] parts = string.split("=");
        String before = parts[0];
        String after = parts[1];
        map.put(before, after);
    }
}
