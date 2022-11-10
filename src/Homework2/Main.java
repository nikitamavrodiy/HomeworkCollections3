package Homework2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        Map<String, List> map1 = new HashMap<>();
//        for (int i = 0; i < 5; i++) {
//            List list = new ArrayList<>();
//            for (int j = 0; j < 3; j++) {
//                list.add(random.nextInt(0, 1000));
//            }
//            map1.put("key" + i, list);
//        }
//
//        Map<String, Integer> map2 = new HashMap<>();
//        for (Map.Entry<String, List> entry : map1.entrySet()) {
//            int sum = 0;
//            for (Object number : entry.getValue()) {
//                sum += (int) number;
//            }
//            map2.put(entry.getKey(), sum);
//        }
//
//        StringBuilder builder = new StringBuilder();
//        for (Map.Entry<String, List> entry : map1.entrySet()) {
//            builder.append(entry.getKey()).append(" --> ").append(entry.getValue()).append(",\n");
//        }
//        System.out.println(String.valueOf(builder));
//
//        builder = new StringBuilder();
//        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
//            builder.append(entry.getKey()).append(" --> ").append(entry.getValue()).append(",\n");
//        }
//        System.out.println(String.valueOf(builder));

        Map<Integer, String> map3 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map3.put(i, "value"+i);
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map3.entrySet()) {
            builder.append(entry.getKey()).append(" --> ").append(entry.getValue()).append(",\n");
        }
        System.out.println(String.valueOf(builder));
    }
}
