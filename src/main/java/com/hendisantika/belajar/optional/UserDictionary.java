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
 * Time: 08:34
 */
public class UserDictionary {
    final HashMap<Integer, String> theList = new HashMap<>();

    UserDictionary() {
        theList.put(0, "Uzumaki Naruto");
        theList.put(1, "Uchiha Sasuke");
        theList.put(2, "Haruno Sakura");
    }

    void addUser(int number, String name) {
        theList.put(number, name);
    }

    Optional<String> getUserByNumber(int number) {
        return Optional.ofNullable(theList.get(number));
    }
}
