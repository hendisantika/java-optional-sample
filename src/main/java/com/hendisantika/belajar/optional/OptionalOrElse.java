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
public class OptionalOrElse {
    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();

        for (int i = 0; i < 4; i++) {
            String user = userDictionary.getUserByNumber(i).orElse("not found");
            System.out.println("Name " + i + " is " + user);
        }
    }
}
