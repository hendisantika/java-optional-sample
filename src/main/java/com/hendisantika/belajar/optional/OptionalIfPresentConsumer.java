package com.hendisantika.belajar.optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:35
 */
public class OptionalIfPresentConsumer {
    public static void main(String[] args) {
        ConsumeName consumer = new ConsumeName();
        UserDictionary userDictionary = new UserDictionary();
        for (int i = 0; i < 3; i++) {
            userDictionary.getUserByNumber(i).ifPresent(consumer::printAName);
        }
    }
}
