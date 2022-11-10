package Homework1;

import java.util.Map;

public class MapCheck {
    public static void addToMap(String key, Integer value, Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
                throw new IllegalArgumentException("такой ключ уже есть и значения совпадают");
            }
        }
        map.put(key, value);
    }

    public static String getMap(Map<String, Integer> map) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue()).append(",");
            builder.append("\n");
        }
        return String.valueOf(builder);
    }
}
