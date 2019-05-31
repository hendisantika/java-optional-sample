package com.hendisantika.belajar.optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:34
 */
public class OptionalIfPresent {
    static int i;

    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();

        for (i = 0; i < 4; i++) {
            userDictionary.getUserByNumber(i).ifPresent(name -> {
                System.out.println("Name " + i + " is " + name);
                name = name.concat(" is a nice guy");
                System.out.println(name);
            });


        }
    }
}
