package Homework1;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    private static Map<String, String> phoneDirectory = new HashMap<>();

    public static void addNumber(String nameKey, String number) {
        phoneDirectory.put(nameKey, number);
    }

    public static String getPhoneDirectory() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue()).append(",");
            builder.append("\n");
        }
        return String.valueOf(builder);
    }
}
