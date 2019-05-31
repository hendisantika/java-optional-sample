package com.hendisantika.belajar.optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:38
 */
public class OptionalOrElseThrow {
    public static void main(String[] args) throws Exception {

        UserDictionary userDictionary = new UserDictionary();

        for (int i = 0; i < 4; i++) {
            String user = userDictionary.getUserByNumber(i).orElseThrow(NameNotFoundException::new);
            System.err.println("Name " + i + " is " + user);
        }
    }

}
