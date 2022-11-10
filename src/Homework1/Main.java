package Homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задание 1
//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            Homework1.PhoneDirectory.addNumber("Александр Валуев" + i,
//                    "+7911430" + random.nextInt(1000, 9999));
//        }
//        System.out.println(Homework1.PhoneDirectory.getPhoneDirectory());

        //Задание 3
        Map<String, Integer> map = new HashMap<>();
        MapCheck.addToMap("key1", 111, map);
        MapCheck.addToMap("key2", 222, map);
        MapCheck.addToMap("key1", 333, map);
        System.out.println(MapCheck.getMap(map));
    }
}