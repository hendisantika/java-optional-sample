package com.hendisantika.belajar.optional;

import java.util.HashMap;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:36
 */
public class OptionalIsPresent {
    public static void main(String[] args) {

        HashMap<Integer, String> stringMap = new HashMap<>();
        stringMap.put(0, "Akimichi Choji");
        stringMap.put(1, "Yamanaka Ino");
        stringMap.put(2, "Naara Shikamaru");

        for (int i = 0; i < 4; i++) {

            Optional<String> optName = Optional.ofNullable(stringMap.get(i));

            if (optName.isPresent()) {
                System.out.println("Name " + i + " is " + optName.get());
            } else {
                System.out.println("Name " + i + " is not found.");
            }
        }
    }
}
