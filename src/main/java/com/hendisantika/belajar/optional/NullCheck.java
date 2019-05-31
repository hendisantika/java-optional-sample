package com.hendisantika.belajar.optional;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:31
 */
public class NullCheck {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> stringMap = new HashMap<>();
        stringMap.put(0, "Uzumaki Naruto");
        stringMap.put(1, "Uchiha Sasuke");
        stringMap.put(2, "Hatake Kakasi");

        for (int i = 0; i < 4; i++) {
            String name = stringMap.get(i);
            if (name != null) {
                System.out.println("Name " + i + " is " + name);
            } else {
                System.out.println("Name " + i + " is not found.");
            }
        }
    }
}
