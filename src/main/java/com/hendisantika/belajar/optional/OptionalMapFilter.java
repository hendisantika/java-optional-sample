package com.hendisantika.belajar.optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:37
 */
public class OptionalMapFilter {
    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();
        for (int i = 0; i < 3; i++) {
            userDictionary.getUserByNumber(i).map(String::toUpperCase)
                    .filter(item -> item.charAt(0) != 'J')
                    .ifPresent(name -> System.out.println("Name is " + name));
        }
    }

}
